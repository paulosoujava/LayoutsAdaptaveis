package com.example.android.sports

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes

sealed class MenuItem(
    // Resource ID of the icon for the menu item
    @DrawableRes val iconId: Int,
    // Resource ID of the label text for the menu item
    @StringRes val labelId: Int,
    // ID of a destination to navigate users
    @IdRes val destinationId: Int
) {

    object Home: MenuItem(
        R.drawable.ic_baseline_home_24,
        R.string.home,
        R.id.SportsListFragment
    )

    object Favorites: MenuItem(
        R.drawable.ic_baseline_favorite_24,
        R.string.favorites,
        R.id.FavoritesFragment
    )

    object Settings: MenuItem(
        R.drawable.ic_baseline_settings_24,
        R.string.settings,
        R.id.SettingsFragment
    )
}