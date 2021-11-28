package com.natashazahr.mine.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Location(
    var name : String?,
    var category: String?,
    var description : String?,
    var pictures : String?,
): Parcelable