package com.example.a203310039_muhamadilham.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Tambahkan anotasi @StringRes ke properti ID resource string
// Tambahkan anotasi @DrawableRes ke properti ID resource drawable
// Program akan mengeluarkan peringatan jika user memberikan jenis ID resource yang salah

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
