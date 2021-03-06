package _390Tests.Release1;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import com.fsck.k9.activity.setup.MailingListMenu;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;

public class RemoveMailingListTest {

    @Rule
    public ActivityTestRule<MailingListMenu> testRule = new ActivityTestRule<MailingListMenu>(MailingListMenu.class);

    @Test
    public void removeMailingListTest()
    {
        Espresso.onView(withId(android.R.id.list));
        onData(anything()).inAdapterView(withId(android.R.id.list)).atPosition(0).perform(longClick());
        Espresso.onView(withText("Delete")).perform(click());
    }
}
