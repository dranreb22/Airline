package com.test.Gui_Tests;

import com.company.Main;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;


public class addFlightGuiTest extends AssertJSwingJUnitTestCase {
    private FrameFixture window;
    JDesktopPane pane;

    @BeforeEach
    @Override
    protected void onSetUp() {
        Main frame = GuiActionRunner.execute(Main::new);


        window = new FrameFixture(frame);
        window.show();

    }

    @Test
    public void checkAddFlight() {
        window.menuItem("flightMenu").click().requireVisible();
        window.menuItem("addFlight").click().requireVisible();
        window.textBox("name").enterText("Gui_tests");
        window.comboBox("source").selectItem(1);
        window.comboBox("depart").selectItem(1);
        window.panel("date").textBox().setText("Apr 1, 2021");
        window.textBox("depTime").setText("1:00");
        window.textBox("ArrTime").setText("2:00");
        window.textBox("charge").setText("100");
        window.button("addFlight").click();

        window.cleanUp();
    }



}

