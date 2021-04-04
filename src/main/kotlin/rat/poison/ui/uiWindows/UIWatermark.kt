package rat.poison.ui.uiWindows

import com.badlogic.gdx.utils.Align
import com.kotcrab.vis.ui.widget.VisLabel
import com.kotcrab.vis.ui.widget.VisTable
import com.kotcrab.vis.ui.widget.VisWindow
import rat.poison.BRANCH

class UIWatermark: VisWindow("", "watermark") {
    val table = VisTable(false)

    val watermarkText = VisLabel("[$BRANCH] ${System.currentTimeMillis()}", Align.top)
    val keybindText = VisLabel("", Align.topRight)

    init {
        padTop(10F)

        table.add(watermarkText).expandX().right().row()
        table.addSeparator()
        table.add(keybindText).expandX().height(64F).right()

        add(table).width(250F).top().right()

        top()
        right()
        pack()
    }
}
