package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import utilities.Driver;
//

public class AdminDashboard {
//

// User Homepage Logo icon
@FindBy(xpath="//img[@class='logo']") public WebElement logoHome;

// User Homepage Home link
@FindBy(xpath="(//li[@class])[1]") public WebElement linkMenuHome;

// User Homepage Listing link
@FindBy(xpath="(//li[@class])[2]") public WebElement linkMenuListing;

// User Homepage Projects link
@FindBy(xpath="(//li[@class])[3]") public WebElement linkMenuProjects;

// User Homepage Agents Link
@FindBy(xpath="(//li[@class])[4]") public WebElement linkMenuAgents;

// User Homepage Blog Link
@FindBy(xpath="(//li[@class])[5]") public WebElement linkMenuBlog;

// User Homepage Contact Link
@FindBy(xpath="(//li[@class])[6]") public WebElement linkMenuContact;

// User Homepage Sign Up Link
@FindBy(xpath="(//li[@class])[7]") public WebElement linkMenuSingUp;

// User Homepage Add Property link
@FindBy(xpath="//a[@class='text-success']") public WebElement linkAddProperty;

// User Homepage Link
@FindBy(xpath="(//li[@class])[8]") public WebElement linkSignIn;

// User Homepage Wishlist link
@FindBy(xpath="//*[@class='text-white']") public WebElement linkWishlist;

// User Homepage Footer Contact Info Field
@FindBy(xpath="(//*[@class='footer-widget'])[1]") public WebElement footerContactInfo;

// User Homepage Footer Copyright Info Field
@FindBy(xpath="//p[@class='mb-0']") public WebElement copyrightInFooter;

// User Homepage Footer Facebook link
@FindBy(xpath="//i[@class='ti-facebook']") public WebElement linkFacebookInFooter;

// User Homepage Footer Twitter link
@FindBy(xpath="//i[@class='ti-twitter']") public WebElement linkTwitterInFooter;

// User Homepage Footer Instagram link
@FindBy(xpath="//i[@class='ti-instagram']") public WebElement linkInstagramInFooter;

// User Homepage Footer LinkedIn link
@FindBy(xpath="//i[@class='ti-linkedin']") public WebElement linkLinkedInInFooter;

// User Homepage Footer Pinterest link
@FindBy(xpath="//i[@class='ti-pinterest']") public WebElement linkPinterestInFooter;

// User Homepage Footer Subscribe button
@FindBy(xpath="//*[@class='btn bg-dark text-white']") public WebElement buttonSubscribeInFooter;

//Listing linkine tiklayinca ve sayfada Search yapinca cikan Result Text
@FindBy(xpath="//h4[@class='m-0']") public WebElement labelListingResultText;

//Listing sayfadaki ve Search yapinca cikan ilk ilan(Property) linki
@FindBy(xpath="(//h4[@class='listing-name'])[1]") public WebElement linkFirstProperty;

//Listing sayfaya girince ve Search yapinca cikan ilk ilana tiklaninca gelen detay texti
@FindBy(xpath="(//h4[@class='property_block_title'])[1]") public WebElement labelFirstPropertyDetail;

//Listing sayfada search icin textbox
@FindBy(xpath="//input[@name='k']") public WebElement textboxListingSearchLocation;

//Listing sayfada Search yapma butonu
@FindBy(xpath="(//button[@type='submit'])[1]") public WebElement buttonListingSearchSubmit;

//Agents linkine tiklayinca cikan ilk emlakci(Agent) linki
//Agents linkine tiklayinca cikan ilk emlakci(Agent) linki @FindBy(xpath="(//h5[@class='fr-can-name'])[1]") public WebElement linkFirstAgent;

//Agents linkine tiklayinca cikan ilk emlakci(Agent) mulk sayisi texti
//Agents linkine tiklayinca cikan ilk emlakci(Agent) mulk sayisi texti @FindBy(xpath="(//span[@class='fr-position'])[1]") public WebElement labelFirstAgentNumberOfProperties;

//Agents linkine tiklayinca cikan ilk emlakci(Agent) iletisim bilgileri texti
//Agents linkine tiklayinca cikan ilk emlakci(Agent) iletisim bilgileri texti @FindBy(xpath="(//div[@class='fr-grid-info'])[1]") public WebElement labelFirstAgentContactInfo;

//Agents linkine tiklayinca cikan ilk emlakci(Agent) detaylarina erisim butonu(view)
//Agents linkine tiklayinca cikan ilk emlakci(Agent) detaylarina erisim butonu(view) @FindBy(xpath="(//a[@class='prt-view'])[1]") public WebElement buttonFirstAgentDetail;

}
//

