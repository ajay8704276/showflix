package com.app.showflix.utils

import java.io.IOException

class NoConnectivityFoundException :IOException()
class ApiResponseResultNUllException(val error: String):Exception()