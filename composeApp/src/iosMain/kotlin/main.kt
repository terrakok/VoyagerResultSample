import androidx.compose.ui.window.ComposeUIViewController
import org.company.app.App
import platform.UIKit.UIViewController

fun MainViewController(systemAppearance: (isLight: Boolean) -> Unit): UIViewController {
    return ComposeUIViewController { App(systemAppearance) }
}
