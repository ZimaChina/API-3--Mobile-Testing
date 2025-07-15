
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val currency: String,
    @SerializedName("in_stock") val inStock: Boolean
)

data class ProductList(
    val products: List<Product>
)

fun main() = runBlocking {
    val apiUrl = "https://jsonkeeper.com/b/MX0A"
    val response = withContext(Dispatchers.IO) {
        val url = URL(apiUrl)
        val conn = url.openConnection() as HttpURLConnection
        conn.requestMethod = "GET"
        conn.inputStream.bufferedReader().use { it.readText() }
    }

    val productList = Gson().fromJson(response, ProductList::class.java)

    println("Listado de productos:")
    productList.products.forEach {
        println("\${it.name} - \${it.price} \${it.currency}")
    }
}
