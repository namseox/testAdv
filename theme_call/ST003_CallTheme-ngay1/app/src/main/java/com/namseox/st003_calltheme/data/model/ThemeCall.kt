package com.namseox.st003_calltheme.data.model

import android.media.Image
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
class ThemeCall(
    @ColumnInfo(name = "photo_bg") var photoBg: String,
    @ColumnInfo(name = "photo_avatar") var photoAvatar: String,
    @ColumnInfo(name = "name_avatar") var nameAvatar: String,
    @ColumnInfo(name = "sdt") var sdt: String,
    @ColumnInfo(name = "photo_accept") var photoAccept: String,
    @ColumnInfo(name = "photo_decline") var photoDecline: String,
    @ColumnInfo(name = "file_name") var filename: String,
    @ColumnInfo(name = "name_sound") var nameSound: String,
    @ColumnInfo(name = "sound") var sound: Int,
    @ColumnInfo(name = "check_apply") var checkApply: Int //0: true, 1: false
): Parcelable {
    @PrimaryKey(autoGenerate = true)  var id: Int = 0
}