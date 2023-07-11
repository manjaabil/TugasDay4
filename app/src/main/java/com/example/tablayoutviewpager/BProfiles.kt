package com.example.tablayoutviewpager

import android.os.Parcel
import android.os.Parcelable

data class BProfiles(
    val imgprofile: Int,
    val name: String,
    val email: String,
    val jurusan: String,
    val semester: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imgprofile)
        parcel.writeString(name)
        parcel.writeString(email)
        parcel.writeString(jurusan)
        parcel.writeString(semester)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AProfiles> {
        override fun createFromParcel(parcel: Parcel): AProfiles {
            return AProfiles(parcel)
        }

        override fun newArray(size: Int): Array<AProfiles?> {
            return arrayOfNulls(size)
        }
    }
}
