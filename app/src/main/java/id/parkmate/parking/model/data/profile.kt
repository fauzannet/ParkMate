package id.parkmate.parking.model.data

import com.google.gson.annotations.SerializedName


data class profile (

    @SerializedName("Mhs")
    val dataprofile: dataprofiles
)

data class waktu (
    val waktu: String
)

data class dataprofiles(
    val Npm: String,
    val Nama: String,
    val Angkatan: String,
    val EmailAmikom: String,
    val Prodi: String,
    val NpmImg: String
)
