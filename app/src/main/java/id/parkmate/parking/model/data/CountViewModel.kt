package id.parkmate.parking.model.data

import androidx.lifecycle.ViewModel

class CountdownViewModel : ViewModel() {
    var countdownValue: Long = 0
    var endTimestamp: Long = 0

    fun setEndTimestamps(timestamp: Long) {
        endTimestamp = timestamp
    }
}