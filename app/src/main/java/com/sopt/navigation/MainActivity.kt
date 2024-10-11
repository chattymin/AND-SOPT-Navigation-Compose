package com.sopt.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.sopt.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = A
                    ) {
                        composable<A> {
                            AScreen(
                                paddingValues = innerPadding,
                                navigateToB = { name ->
                                    navController.navigate(B(name))
                                }
                            )
                        }

                        composable<B> { backStackEntry ->
                            val item = backStackEntry.toRoute<B>()
                            BScreen(
                                paddingValues = innerPadding,
                                name = item.name,
                                navigateToC = { id, password ->
                                    navController.navigate(C(id, password))
                                }
                            )
                        }

                        composable<C> { backStackEntry ->
                            val item = backStackEntry.toRoute<C>()
                            CScreen(
                                paddingValues = innerPadding,
                                c = item,
                                navigateToD = { id, password ->
                                    navController.navigate(D(id, password))
                                }
                            )
                        }

                        composable<D> {
                            DScreen(
                                paddingValues = innerPadding
                            )
                        }
                    }
                }
            }
        }
    }
}
