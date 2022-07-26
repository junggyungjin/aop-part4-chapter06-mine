package fastcampus.aop.part4.chapter06_mine.data.services

import fastcampus.aop.part4.chapter06_mine.BuildConfig
import fastcampus.aop.part4.chapter06_mine.data.models.airquality.AirQualityResponse
import fastcampus.aop.part4.chapter06_mine.data.models.monitoringstation.MonitoringStationResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AirKoreaApiService {

    @GET("B552584/MsrstnInfoInqireSvc/getNearbyMsrstnList" +
            "?serviceKey=${BuildConfig.AIR_KOREA_SERVICE_KEY}" +
            "&returnType=json")
    suspend fun getNearbyMonitoringStation(
        @Query("tmX") tmX: Double?,
        @Query("tmY") tmY: Double?
    ): Response<MonitoringStationResponse>

    @GET("B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty" +
            "?serviceKey=${BuildConfig.AIR_KOREA_SERVICE_KEY}" +
            "&returnType=json" +
            "&dataTerm=DAILY" +
            "&ver=1.3")
    suspend fun getRealtimeAirQualties(
        @Query("stationName") stationName: String
    ): Response<AirQualityResponse>
}