public class App {
    private ThemeFactory themeFactory;

    public App(ThemeFactory themeFactory){
        this.themeFactory = themeFactory;
    }

    public void paintUI(){
        Button button = themeFactory.createButton();
        Checkbox checkbox = themeFactory.createCheckbox();
        button.render();
        checkbox.toggle();
    }

    public static void main(String[] args){
        ThemeFactory darkThemeFactory  = new DarkThemeFactory();          
        App darkApplication = new App(darkThemeFactory);
        darkApplication.paintUI();
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        App lightApplication = new App(lightThemeFactory);
        lightApplication.paintUI();
    }
}
