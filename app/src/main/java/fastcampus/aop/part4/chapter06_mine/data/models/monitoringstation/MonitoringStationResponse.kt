package fastcampus.aop.part4.chapter06_mine.data.models.monitoringstation


import com.google.gson.annotations.SerializedName

data class MonitoringStationResponse(
    @SerializedName("response")
    val response: Response?
)