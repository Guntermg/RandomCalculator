package gmg.projects.randomcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.SideEffect
import gmg.projects.randomcalculator.ui.theme.RandomCalculatorTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import gmg.projects.randomcalculator.ui.theme.DarkGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RandomCalculatorTheme {
                // A surface container using the 'background' color from the theme
                val viewModel = CalculatorViewModel()
                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = DarkGray,
                        darkIcons = false
                    )
                }

                CalculatorUI(
                    viewModel = viewModel
                )
            }
        }
    }
}
