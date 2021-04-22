package com.test.Gui_Tests;

import javax.swing.JDesktopPane;

import com.company.Login;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.Containers;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;


public class loginGuiTest extends AssertJSwingJUnitTestCase {
    private FrameFixture window;
    JDesktopPane pane;

    @BeforeEach
    @Override
    protected void onSetUp() {
        Login test = GuiActionRunner.execute(Login::new);
        Container container = test.getContentPane();
        pane = new JDesktopPane();
        pane.add(container);
        test.setVisible(true);

        window = new FrameFixture(Containers.frameFor(container));
        window.show();
    }

    @Test
    public void checkValidLogin() {

        window.textBox("username").setText("demo");
        window.textBox("password").setText("123");
        window.button("loginButton").click();
        window.cleanUp();

    }
}

