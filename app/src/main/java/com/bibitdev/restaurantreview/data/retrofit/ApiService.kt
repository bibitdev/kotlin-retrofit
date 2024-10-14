import com.bibitdev.restaurantreview.data.response.PostReviewResponse
import com.bibitdev.restaurantreview.data.response.RestaurantResponse
import okhttp3.Callback
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id") id : String,
        @Field("name") name : String,
        @Field("review") review : String
    ) : Call<PostReviewResponse>
}
