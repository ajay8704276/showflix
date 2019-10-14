package com.app.showflix.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.app.showflix.R
import com.app.showflix.model.tv.Results
import com.app.showflix.utils.Constants
import com.app.showflix.utils.NetworkState
import com.app.showflix.view.activities.tv.PopularTvDetailActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.network_state_item.view.*
import kotlinx.android.synthetic.main.people_list_item.view.name
import kotlinx.android.synthetic.main.tv_list_item.view.*

class PopularTvPagedListAdapter(private val context: Context) :
    PagedListAdapter<Results, RecyclerView.ViewHolder>(TvDiffCallback()) {

    val TV_VIEW_TYPE = 1
    val NETWORK_VIEW_TYPE = 2

    private var networkState: NetworkState? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View
        if (viewType == TV_VIEW_TYPE) {
            view = layoutInflater.inflate(R.layout.tv_list_item, parent, false)
            return TvItemViewHolder(view)
        } else {
            view = layoutInflater.inflate(R.layout.network_state_item, parent, false)
            return NetworkStateItemViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (getItemViewType(position) == TV_VIEW_TYPE) {
            (holder as TvItemViewHolder).bind(getItem(position), context)
        } else {
            (holder as NetworkStateItemViewHolder).bind(networkState)
        }
    }


    private fun hasExtraRow(): Boolean {
        return networkState != null && networkState != NetworkState.LOADED
    }

    override fun getItemCount(): Int {
        return super.getItemCount() + if (hasExtraRow()) 1 else 0
    }

    override fun getItemViewType(position: Int): Int {
        return if (hasExtraRow() && position == itemCount - 1) {
            NETWORK_VIEW_TYPE
        } else {
            TV_VIEW_TYPE
        }
    }


    fun setNetworkState(newNetworkState: NetworkState) {
        val previousState = this.networkState
        val hadExtraRow = hasExtraRow()
        this.networkState = newNetworkState
        val hasExtraRow = hasExtraRow()

        if (hadExtraRow != hasExtraRow) {
            if (hadExtraRow) {                             //hadExtraRow is true and hasExtraRow false
                notifyItemRemoved(super.getItemCount())    //remove the progressbar at the end
            } else {                                       //hasExtraRow is true and hadExtraRow false
                notifyItemInserted(super.getItemCount())   //add the progressbar at the end
            }
        } else if (hasExtraRow && previousState != newNetworkState) { //hasExtraRow is true and hadExtraRow true and (NetworkState.ERROR or NetworkState.ENDOFLIST)
            notifyItemChanged(itemCount - 1)       //add the network message at the end
        }

    }


    class TvDiffCallback : DiffUtil.ItemCallback<Results>() {
        override fun areItemsTheSame(oldItem: Results, newItem: Results): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Results, newItem: Results): Boolean {
            return oldItem == newItem
        }
    }


    class TvItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(people: Results?, context: Context) {
            itemView.name.text = people?.name
            itemView.overview.text = people?.overview

            val moviePosterURL = Constants.POSTER_BASE_URL + people?.poster_path
            Glide.with(itemView.context)
                .load(moviePosterURL)
                .into(itemView.poster_path)

            itemView.setOnClickListener {
                Toast.makeText(context, "Item clicked", Toast.LENGTH_LONG).show()
                val intent = Intent(context, PopularTvDetailActivity::class.java)
                intent.putExtra("id", people?.id)
                context.startActivity(intent)
            }

        }
    }

    class NetworkStateItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(networkState: NetworkState?) {
            if (networkState != null && networkState == NetworkState.LOADING) {
                itemView.progress_bar_item.visibility = View.VISIBLE;
            } else {
                itemView.progress_bar_item.visibility = View.GONE;
            }

            if (networkState != null && networkState == NetworkState.ERROR) {
                itemView.error_msg_item.visibility = View.VISIBLE;
                itemView.error_msg_item.text = networkState.msg;
            } else if (networkState != null && networkState == NetworkState.ENDOFLIST) {
                itemView.error_msg_item.visibility = View.VISIBLE;
                itemView.error_msg_item.text = networkState.msg;
            } else {
                itemView.error_msg_item.visibility = View.GONE;
            }
        }
    }
}