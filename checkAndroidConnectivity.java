  private fun checkConnectivity() {
    val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetwork = connectivityManager.activeNetworkInfo
    val isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting
    if(!isConnected) {
      Toast.makeText(this, "NO INTERNET CONNECTION!", Toast.LENGTH_SHORT).show()
    }
  }
