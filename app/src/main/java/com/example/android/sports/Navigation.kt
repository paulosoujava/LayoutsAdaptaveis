package com.example.android.sports

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun BottomNavigationBar(
    menuItems: List<MenuItem>,
    modifier: Modifier = Modifier,
    onMenuSelected: (MenuItem) -> Unit = {}
) {

    NavigationBar(modifier = modifier) {
        menuItems.forEach { menuItem ->
            NavigationBarItem(
                selected = false,
                onClick = { onMenuSelected(menuItem) },
                icon = {
                    Icon(
                        painter = painterResource(id = menuItem.iconId),
                        contentDescription = null)
                },
                label = { Text(text = stringResource(id = menuItem.labelId)) }
            )
        }
    }
}