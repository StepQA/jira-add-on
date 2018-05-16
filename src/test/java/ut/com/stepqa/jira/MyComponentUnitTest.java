package ut.com.stepqa.jira;

import org.junit.Test;
import com.stepqa.jira.api.MyPluginComponent;
import com.stepqa.jira.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}