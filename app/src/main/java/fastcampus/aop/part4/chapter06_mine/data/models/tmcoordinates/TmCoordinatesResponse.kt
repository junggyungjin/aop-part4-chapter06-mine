package fastcampus.aop.part4.chapter06_mine.data.models.tmcoordinates


import com.google.gson.annotations.SerializedName

data class TmCoordinatesResponse(
    @SerializedName("documents")
    val documents: List<Document?>?,
    @SerializedName("meta")
    val meta: Meta?
)