package com.app.showflix.databinding;
import com.app.showflix.R;
import com.app.showflix.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PopularMovieDetailActivityBindingImpl extends PopularMovieDetailActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 9);
        sViewsWithIds.put(R.id.iv_movie_poster, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PopularMovieDetailActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private PopularMovieDetailActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.movieBudget.setTag(null);
        this.movieOverview.setTag(null);
        this.movieRating.setTag(null);
        this.movieReleaseDate.setTag(null);
        this.movieRevenue.setTag(null);
        this.movieRuntime.setTag(null);
        this.movieTagline.setTag(null);
        this.movieTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.testViewModel == variableId) {
            setTestViewModel((com.app.showflix.viewmodel.movies.PopularMovieDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTestViewModel(@Nullable com.app.showflix.viewmodel.movies.PopularMovieDetailViewModel TestViewModel) {
        this.mTestViewModel = TestViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.testViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTestViewModelPopularMovieDetailLiveData((androidx.lifecycle.MutableLiveData<com.app.showflix.model.movies.PopularMovieDetailResponse>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTestViewModelPopularMovieDetailLiveData(androidx.lifecycle.MutableLiveData<com.app.showflix.model.movies.PopularMovieDetailResponse> TestViewModelPopularMovieDetailLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stringValueOfTestViewModelPopularMovieDetailLiveDataRevenue = null;
        androidx.lifecycle.MutableLiveData<com.app.showflix.model.movies.PopularMovieDetailResponse> testViewModelPopularMovieDetailLiveData = null;
        com.app.showflix.viewmodel.movies.PopularMovieDetailViewModel testViewModel = mTestViewModel;
        java.lang.String stringValueOfTestViewModelPopularMovieDetailLiveDataRuntime = null;
        java.lang.String stringValueOfTestViewModelPopularMovieDetailLiveDataVoteCount = null;
        int testViewModelPopularMovieDetailLiveDataVoteCount = 0;
        int testViewModelPopularMovieDetailLiveDataRuntime = 0;
        java.lang.String testViewModelPopularMovieDetailLiveDataReleaseDate = null;
        java.lang.String testViewModelPopularMovieDetailLiveDataOverview = null;
        java.lang.String testViewModelPopularMovieDetailLiveDataTitle = null;
        java.lang.String testViewModelPopularMovieDetailLiveDataTagline = null;
        com.app.showflix.model.movies.PopularMovieDetailResponse testViewModelPopularMovieDetailLiveDataGetValue = null;
        int testViewModelPopularMovieDetailLiveDataRevenue = 0;
        java.lang.String stringValueOfTestViewModelPopularMovieDetailLiveDataBudget = null;
        int testViewModelPopularMovieDetailLiveDataBudget = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (testViewModel != null) {
                    // read testViewModel.popularMovieDetailLiveData
                    testViewModelPopularMovieDetailLiveData = testViewModel.getPopularMovieDetailLiveData();
                }
                updateLiveDataRegistration(0, testViewModelPopularMovieDetailLiveData);


                if (testViewModelPopularMovieDetailLiveData != null) {
                    // read testViewModel.popularMovieDetailLiveData.getValue()
                    testViewModelPopularMovieDetailLiveDataGetValue = testViewModelPopularMovieDetailLiveData.getValue();
                }


                if (testViewModelPopularMovieDetailLiveDataGetValue != null) {
                    // read testViewModel.popularMovieDetailLiveData.getValue().vote_count
                    testViewModelPopularMovieDetailLiveDataVoteCount = testViewModelPopularMovieDetailLiveDataGetValue.getVote_count();
                    // read testViewModel.popularMovieDetailLiveData.getValue().runtime
                    testViewModelPopularMovieDetailLiveDataRuntime = testViewModelPopularMovieDetailLiveDataGetValue.getRuntime();
                    // read testViewModel.popularMovieDetailLiveData.getValue().release_date
                    testViewModelPopularMovieDetailLiveDataReleaseDate = testViewModelPopularMovieDetailLiveDataGetValue.getRelease_date();
                    // read testViewModel.popularMovieDetailLiveData.getValue().overview
                    testViewModelPopularMovieDetailLiveDataOverview = testViewModelPopularMovieDetailLiveDataGetValue.getOverview();
                    // read testViewModel.popularMovieDetailLiveData.getValue().title
                    testViewModelPopularMovieDetailLiveDataTitle = testViewModelPopularMovieDetailLiveDataGetValue.getTitle();
                    // read testViewModel.popularMovieDetailLiveData.getValue().tagline
                    testViewModelPopularMovieDetailLiveDataTagline = testViewModelPopularMovieDetailLiveDataGetValue.getTagline();
                    // read testViewModel.popularMovieDetailLiveData.getValue().revenue
                    testViewModelPopularMovieDetailLiveDataRevenue = testViewModelPopularMovieDetailLiveDataGetValue.getRevenue();
                    // read testViewModel.popularMovieDetailLiveData.getValue().budget
                    testViewModelPopularMovieDetailLiveDataBudget = testViewModelPopularMovieDetailLiveDataGetValue.getBudget();
                }


                // read String.valueOf(testViewModel.popularMovieDetailLiveData.getValue().vote_count)
                stringValueOfTestViewModelPopularMovieDetailLiveDataVoteCount = java.lang.String.valueOf(testViewModelPopularMovieDetailLiveDataVoteCount);
                // read String.valueOf(testViewModel.popularMovieDetailLiveData.getValue().runtime)
                stringValueOfTestViewModelPopularMovieDetailLiveDataRuntime = java.lang.String.valueOf(testViewModelPopularMovieDetailLiveDataRuntime);
                // read String.valueOf(testViewModel.popularMovieDetailLiveData.getValue().revenue)
                stringValueOfTestViewModelPopularMovieDetailLiveDataRevenue = java.lang.String.valueOf(testViewModelPopularMovieDetailLiveDataRevenue);
                // read String.valueOf(testViewModel.popularMovieDetailLiveData.getValue().budget)
                stringValueOfTestViewModelPopularMovieDetailLiveDataBudget = java.lang.String.valueOf(testViewModelPopularMovieDetailLiveDataBudget);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieBudget, stringValueOfTestViewModelPopularMovieDetailLiveDataBudget);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieOverview, testViewModelPopularMovieDetailLiveDataOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieRating, stringValueOfTestViewModelPopularMovieDetailLiveDataVoteCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieReleaseDate, testViewModelPopularMovieDetailLiveDataReleaseDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieRevenue, stringValueOfTestViewModelPopularMovieDetailLiveDataRevenue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieRuntime, stringValueOfTestViewModelPopularMovieDetailLiveDataRuntime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieTagline, testViewModelPopularMovieDetailLiveDataTagline);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieTitle, testViewModelPopularMovieDetailLiveDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): testViewModel.popularMovieDetailLiveData
        flag 1 (0x2L): testViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}