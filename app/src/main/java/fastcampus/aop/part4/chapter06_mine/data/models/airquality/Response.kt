package fastcampus.aop.part4.chapter06_mine.data.models.airquality


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("body")
    val body: Body?,
    @SerializedName("header")
    val header: Header?
)