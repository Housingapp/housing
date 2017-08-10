package edu.depaul.housing;


import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.TextArea;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.components.ScaleImageButton;
import com.codename1.components.ScaleImageLabel;
//import com.codename1.io.Log;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;

//import java.io.IOException;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class HousingApp {

    private Form current;
    private Resources theme;

    public void init(Object context) {
        theme = UIManager.initFirstTheme("/theme");

        // Enable Toolbar on all Forms by default
        Toolbar.setGlobalToolbar(true);

        // Pro only feature, uncomment if you have a pro subscription
        // Log.bindCrashProtection(true);
    }
    
    public void start() {
        if(current != null){
            current.show();
            return;
        }
        Form hi = new Form("");
        hi.getToolbar().setUIID("Container");
        hi.getToolbar().hideToolbar();
        hi.setLayout(new BorderLayout());
        hi.setScrollableY(true);
        
        Container c = new Container(); 
        c.setScrollableY(true);
        c.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        
        Label header = new ScaleImageLabel(theme.getImage("spring2014slideshow1.jpg"));
        header.setUIID("HomePage");
        c.addComponent(header);
        
        Label title = new ScaleImageLabel(theme.getImage("AppTitle.png"));
        title.setUIID("AppTitle");
        c.addComponent(title);

        Button about = new ScaleImageButton(theme.getImage("Option 1.png"));
        about.setUIID("BiggerButton");
        about.addActionListener((e) -> 
        {
        	showAbout();
        });
        c.addComponent(about);
        
        Button resInfo = new ScaleImageButton(theme.getImage("Option 1.png"));
        resInfo.setUIID("BiggerButton");
        resInfo.addActionListener((e) -> 
        {
        	showResInfo();
        });
        c.addComponent(resInfo);
        
        Button dates = new ScaleImageButton(theme.getImage("Option 1.png"));
        dates.setUIID("BiggerButton");
        c.addComponent(dates);
        
        Button dining = new ScaleImageButton(theme.getImage("Option 1.png"));
        dining.setUIID("BiggerButton");
        c.addComponent(dining);
        
        Button news = new ScaleImageButton(theme.getImage("Option 1.png"));
        news.setUIID("BiggerButton");
        c.addComponent(news);
        
        Button maps = new ScaleImageButton(theme.getImage("Option 1.png"));
        maps.setUIID("BiggerButton");
        c.addComponent(maps);
        
        
        
        hi.addComponent(BorderLayout.CENTER, c);
        hi.show();
    }
    
    public void showAbout()
    {
    	Form f = new Form("About");
    	f.setLayout(new BorderLayout());
    	
    	Container content = new Container();
    	content.setScrollableY(true);
    	Container TextBox1 = new Container();
    	TextBox1.setUIID("TextBox");
    	
    	TextArea aboutText = new TextArea("Life in a residence hall is an important aspect of a college education experience. Residence halls are more than just rooms or places to sleep. They are places where students develop meaningful friendships, explore new ideas and get involved with the university community. Living in campus housing provides the opportunity to learn to balance the academic and social aspects of life at DePaul University.\r\n" + 
    			"\r\n" + 
    			"Explore the links below to learn more about the Department of Housing Services");
    	aboutText.setEditable(false);
    	TextBox1.addComponent(aboutText);
    	content.addComponent(TextBox1);
    	
    	Container buttonArea1 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
    	Button mission = new ScaleImageButton(theme.getImage("Option 1.png"));
        mission.setUIID("BiggerButton");
        buttonArea1.addComponent(mission);
        mission.addActionListener((e) -> 
        {
        	showMission();
        });
        
        Button apply = new ScaleImageButton(theme.getImage("Option 1.png"));
        mission.setUIID("BiggerButton");
        buttonArea1.addComponent(apply);
        apply.addActionListener((e) ->
        {
        	Display.getInstance().execute("https://offices.depaul.edu/housing/about/apply-for-housing/Pages/default.aspx");
        });
        
        content.addComponent(buttonArea1);
    	
    	f.addComponent(BorderLayout.CENTER, content);
    	f.show();
    }
    
    public void showMission()
    {
    	Form f = new Form("Mission and Vision");
    	f.setLayout(new BorderLayout());
    	Container content = new Container();
    	content.setScrollableY(true);
    	
    	Label picture1 = new ScaleImageLabel(theme.getImage("Table by UHall.jpg"));
    	content.addComponent(picture1);
    	
    	Container textPane = new Container(new BoxLayout(BoxLayout.Y_AXIS));
    	// ourMission = new Title("Our Mission");
    	
    	
    	
    	f.addComponent(BorderLayout.CENTER, content);
    	f.show();
    }
    
    public void showResInfo()
    {
    	Form f = new Form("Resident Information");
    	f.setLayout(new BorderLayout());
    	
    	System.out.println("Hi");
    	
    	f.show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
        if(current instanceof Dialog) {
            ((Dialog)current).dispose();
            current = Display.getInstance().getCurrent();
        }
    }
    
    public void destroy() {
    }

}
