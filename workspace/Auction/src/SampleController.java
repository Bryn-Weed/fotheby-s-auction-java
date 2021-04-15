

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SampleController {
	@FXML
	private MatisseConnector mtc;
	@FXML
	private VBox vbox;
	@FXML
	private Button loginbutton;
	@FXML
	private TextField logintext;
	@FXML
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button users;
	@FXML
	private Button auctions, backButton, viewCatalogue, auctionSearch;
	@FXML
	private Button viewAuction;
	@FXML
	private Button catalogues;
	@FXML
	private Button additem;
	@FXML
	private Button adduser;
	@FXML
	private Button viewitem;
	@FXML
	private Button listPopulate;
	@FXML
	private Button updateItem, removeItem, deleteitem, soldItem;
	@FXML
	private Button back;
	@FXML
	private String imgUrl;
	@FXML
	private Button createUser;
	@FXML
	private Button createItem, imageChooser, lotNoSearchButton, auctioneerViewItem, reportGenerate;
	@FXML
	private TextField confirmedcreate, lotNoSearch;
	@FXML
	private TextField confirmedadd, confirmeditem, itemUpdated;
	@FXML
	private TextField title, firstname, surname, address, telephone, status, approved, email, account, sortcode, personNo;
	@FXML
	private TextField idSearch;
	@FXML
	private TextField titleSearch, firstnameSearch, surnameSearch, addressSearch, telephoneSearch, statusSearch, approvedSearch, emailSearch, accountSearch, sortcodeSearch;
	@FXML
	private TextField lotNo, artistName, yearOfProduction, classification, auctionDate, estPrice, resPrice, commissionBidding, bidAmount, clientNo, itemNo;
	@FXML
	private TextField lotNoView, artistNameView, yearOfProductionView, classificationView, auctiondateView, estPriceView;
	@FXML
	private TextField auctionTitle, feeValue, date2weeks, dateFieldReport, dateFieldTop, auctionName, confirmSale, auctionReservePrice, auctionCommissionBids, auctionSold, auctionPrice, auctionClientNo, auctionComments;
	@FXML
	private TextArea descriptionView;
	@FXML
	private ImageView itemImage;
	@FXML
	private TextArea description;
	@FXML
	private ListView itemList, auctionList;
	@FXML
	private Button customerAuction, addToAuction;


	public Double x = 2222.0;
	// Event Listener on Button[#loginbutton].onAction
	@FXML
	public void login(ActionEvent event) throws Exception {
		String username = usernameField.getText();
		String password = passwordField.getText();
		if(username.equals("staff") && password.equals("staff"))
			// Security Credentials TO BE DATABASE
		{
			Parent root = FXMLLoader.load(getClass().getResource("./Sample2.fxml"));
		       Stage stage1 = new Stage();
		       stage1.setScene(new Scene(root, 470, 370));
		       stage1.show();
		}
		else if (username.equals("customer") && password.equals("customer"))
		{
			Parent root = FXMLLoader.load(getClass().getResource("Customers.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root, 470, 370));
			stage.show();
		}

		else
		{
			logintext.setText("Incorrect username or password.");
		}
	}

	@FXML
	public void users(ActionEvent event) throws Exception{
		Parent root1 = FXMLLoader.load(getClass().getResource("./Users.fxml"));
	       Stage stage2 = new Stage();
	       stage2.setScene(new Scene(root1, 530, 550));
	       stage2.show();
	}

	@FXML
	public void customersAuctions(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("./CustomerAuctions.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(root, 530, 550));
		stage.show();
	}

	@FXML
	public void createUsers(ActionEvent event) throws Exception{
		Parent root2 = FXMLLoader.load(getClass().getResource("./AddUser.fxml"));
	       Stage stage3 = new Stage();
	       stage3.setScene(new Scene(root2, 540, 550));
	       stage3.show();
	}

	@FXML
	public void auctions(ActionEvent event) throws Exception{
		Parent root3 = FXMLLoader.load(getClass().getResource("./AuctionItems.fxml"));
	       Stage stage4 = new Stage();
	       stage4.setScene(new Scene(root3, 510, 400));
	       stage4.show();


	}

	@FXML
	public void addItem(ActionEvent event) throws Exception{
		Parent root4 = FXMLLoader.load(getClass().getResource("./addItem.fxml"));
	       Stage stage5 = new Stage();
	       stage5.setScene(new Scene(root4, 540, 690));
	       stage5.show();
	}

	@FXML
	public void viewItem(ActionEvent event) throws Exception{
		Parent root5 = FXMLLoader.load(getClass().getResource("./viewItem.fxml"));
	       Stage stage6 = new Stage();
	       stage6.setScene(new Scene(root5, 540, 510));
	       stage6.show();
	}

	@FXML
	public void viewAuctions(ActionEvent event) throws Exception{
		Parent root6 = FXMLLoader.load(getClass().getResource("./Auction.fxml"));
	       Stage stage7 = new Stage();
	       stage7.setScene(new Scene(root6, 810, 370));
	       stage7.show();
	}

	@FXML
	public void viewCatalogue(ActionEvent event) throws Exception{
		Parent root7 = FXMLLoader.load(getClass().getResource("./Catalogue.fxml"));
	       Stage stage8 = new Stage();
	       stage8.setScene(new Scene(root7, 800, 670));
	       stage8.show();
	}

	@FXML
	public void back(ActionEvent event) throws Exception{
		Stage stage = (Stage) back.getScene().getWindow();
		stage.close();
		//close stage
	}


	@FXML
	public void chooseImage(ActionEvent event) throws Exception{
		JFileChooser imageSelect = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter( "JPG, PNG & GIF Images",  "jpg", "png", "gif");
		imageSelect.setFileFilter(filter);
		// open menu for users to select image file

		int returnval = imageSelect.showOpenDialog(null);

		if (returnval == JFileChooser.APPROVE_OPTION){
			imgUrl = imageSelect.getSelectedFile().getAbsolutePath();
		}
	}
	@FXML
	public void createItem(ActionEvent event) throws Exception{

		mtc = new MatisseConnector();
		mtc.connect();

		item Item = new item(mtc.getDB());
		// Update new Item

	Double lotNoe = Double.parseDouble(lotNo.getText());
	Item.setLotNumber(lotNoe);
	Item.setArtistName(artistName.getText());
	Item.setYearOfProduction(yearOfProduction.getText());
	Item.setClassification(classification.getText());
	DateFormat df = new SimpleDateFormat("dd MM yyyy");
	Date date = df.parse(auctionDate.getText());
	GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(date);
	Item.setAuctionDate(cal);
	double estimatePrice = Double.parseDouble(estPrice.getText());
	Item.setEstPrice(estimatePrice);
	Item.setDescription(description.getText());
	Item.setCommissionBid(commissionBidding.getText());
	double bidPrice = Double.parseDouble(bidAmount.getText());
	Item.setCommissionBidAmount(bidPrice);
	double resePrice = Double.parseDouble(resPrice.getText());
	Item.setReservePrice(resePrice);
	Item.setClientNo(clientNo.getText());
	Item.setImage(imgUrl.getBytes());
	Integer itemnumber = Integer.valueOf(itemNo.getText());
	Item.setItemNo(itemnumber);

if (imgUrl.isEmpty()){
	System.out.println("Image empty.");
}
// img check



	confirmedcreate.setText("Item created.");
	// user feedback
	mtc.disconnect();
	}

	@FXML
	public void create(ActionEvent event) throws Exception{

	mtc = new MatisseConnector();
	mtc.connect();

	person User = new person(mtc.getDB());

	User.setTitle(title.getText());
	User.setFirstname(firstname.getText());
	User.setSurname(surname.getText());
	User.setAddress(address.getText());
	User.setNumber(telephone.getText());
	User.setEmail(email.getText());
	User.setStatus(status.getText());
	User.setApproved(approved.getText());
	User.setAccount(account.getText());
	double sortingcode = Double.parseDouble(sortcode.getText());
	User.setSortcode(sortingcode);
	Integer personNumber = Integer.valueOf(personNo.getText());
	User.setPersonNo(personNumber);
	// create new user

	confirmedadd.setText("User created.");
	mtc.disconnect();

	}

	public void populateList(ActionEvent event) throws Exception{
		mtc = new MatisseConnector();
		mtc.connect();
// populating list element
		Iterator<item> i = item.instanceIterator(mtc.getDB());

		Integer[] toDisplay = new Integer [ (int) item.getInstanceNumber(mtc.getDB())];

		item tempItem;
		int position = 0;
		while (i.hasNext()) {
			tempItem = i.next();
			toDisplay[position] = tempItem.getItemNo();
			position++;
		}

		ObservableList<Integer> itemLister = FXCollections.observableArrayList(toDisplay);

		itemList.setItems(itemLister);

		mtc.disconnect();
	}

	public void populateAuctionList(ActionEvent event) throws Exception{
		mtc = new MatisseConnector();
		mtc.connect();
// populate list for auction data
		Iterator<item> i = item.instanceIterator(mtc.getDB());

		Integer[] toDisplay = new Integer [ (int) item.getInstanceNumber(mtc.getDB())];

		item tempItem;
		int position = 0;
		while (i.hasNext()) {
			tempItem = i.next();
			toDisplay[position] = tempItem.getItemNo();
			position++;
		}

		ObservableList<Integer> itemLister = FXCollections.observableArrayList(toDisplay);

		auctionList.setItems(itemLister);

		mtc.disconnect();
	}
	public void itemSearch(ActionEvent event) throws Exception{
		mtc = new MatisseConnector();
		mtc.connect();
		// search by item

		Double itemSearch = Double.parseDouble(lotNoSearch.getText());
		item FindItem = item.lookupFindItem(mtc.getDB(),  itemSearch);

		String lotNo = String.valueOf(FindItem.getLotNumber());
		lotNoView.setText(lotNo);
		artistNameView.setText(FindItem.getArtistName());
		yearOfProductionView.setText(FindItem.getYearOfProduction());
		classificationView.setText(FindItem.getClassification());
		String estPricee = String.valueOf(FindItem.getEstPrice());
		estPriceView.setText(estPricee);
		descriptionView.setText(FindItem.getDescription());

		SimpleDateFormat formatter = new SimpleDateFormat("dd MM yy");
		auctiondateView.setText(formatter.format(FindItem.getAuctionDate().getTime()));
		// gregorian calendar formatting


		byte[] imgTemp;

		imgTemp = FindItem.getImage();
		if (imgTemp== null){
			System.out.println("Image empty.");
		}
		// image check
		ByteArrayInputStream bis = new ByteArrayInputStream(imgTemp);
		BufferedImage bufferedImage = ImageIO.read(bis);
		itemImage.setImage(SwingFXUtils.toFXImage(bufferedImage, null));
		// convert db image to imageview javafx


		mtc.disconnect();
	}

	public void itemUpdate(ActionEvent event) throws Exception{
		mtc = new MatisseConnector();
		mtc.connect();
// update item data
		Double itemEdit = Double.parseDouble(lotNoSearch.getText());
		item itemUpdate = item.lookupFindItem(mtc.getDB(),  itemEdit);

		Double lotNo = Double.parseDouble(lotNoView.getText());
		itemUpdate.setLotNumber(lotNo);
		itemUpdate.setArtistName(artistNameView.getText());
		itemUpdate.setYearOfProduction(yearOfProductionView.getText());
		itemUpdate.setClassification(classificationView.getText());
		Double estiPrice = Double.parseDouble(estPriceView.getText());
		itemUpdate.setEstPrice(estiPrice);
		itemUpdate.setDescription(descriptionView.getText());
		DateFormat df = new SimpleDateFormat("dd MM yyyy");
		Date date = df.parse(auctiondateView.getText());
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		itemUpdate.setAuctionDate(cal);

		itemUpdated.setText("Item Updated.");

		mtc.disconnect();
	}

	public void remove(ActionEvent event) throws Exception{
		mtc = new MatisseConnector();
		mtc.connect();
		// remove item from database

		Double itemRemove = Double.parseDouble(lotNoSearch.getText());
		item itemRemover = item.lookupFindItem(mtc.getDB(),  itemRemove);

		itemRemover.remove();

		itemUpdated.setText("Item Removed." +itemRemove);

		mtc.disconnect();
	}

	public void removeFromList(ActionEvent event) throws Exception{
		mtc = new MatisseConnector();
		mtc.connect();
// remove item from list element
		String itemRemoved = itemList.getSelectionModel().getSelectedItem().toString();

		Double x = Double.valueOf(itemRemoved);


		System.out.println("Item removed:" +x );

		item itemRemover = item.lookupFindItem(mtc.getDB(), x);

		itemRemover.remove();

		mtc.disconnect();
	}

	public void addToAuction(ActionEvent event) throws Exception{
		mtc = new MatisseConnector();
		mtc.connect();
// add an item to a specific auction
		String itemAdded = itemList.getSelectionModel().getSelectedItem().toString();

		x = Double.valueOf(itemAdded);

		System.out.println("Report generated for:" +x );

		Parent root7 = FXMLLoader.load(getClass().getResource("./GenerateReport.fxml"));
	       Stage stage8 = new Stage();
	       stage8.setScene(new Scene(root7, 800, 670));
	       stage8.show();



		mtc.disconnect();
	}

	public void generateReport(ActionEvent event) throws Exception{

		mtc = new MatisseConnector();
		mtc.connect();
		// generate report as business event letter from client data form

		item itemAdder = item.lookupFindItem(mtc.getDB(), x);


		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date today = Calendar.getInstance().getTime();
		String date1 = df.format(today);
		dateFieldTop.setText(date1);

		SimpleDateFormat formatter = new SimpleDateFormat("dd MM yy");
		dateFieldReport.setText(formatter.format(itemAdder.getAuctionDate().getTime()));

		int noOfDays = 14;
		Calendar calendar = itemAdder.getAuctionDate();
		calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date date2 = calendar.getTime();

		DateFormat df1 = new SimpleDateFormat("dd MM yy");
		date2weeks.setText(df1.format(date2));

		Double price = itemAdder.getEstPrice();
		Double fee = price * 0.1;
		String feeText = String.valueOf(fee);
		feeValue.setText(feeText);

		mtc.disconnect();;
	}

	public void getAuctionData(ActionEvent event) throws Exception{
		mtc = new MatisseConnector();
		mtc.connect();
// get data of specific item for auctioneer table
		String itemFinding = auctionList.getSelectionModel().getSelectedItem().toString();

		Double x = Double.valueOf(itemFinding);


		System.out.println("Viewing item:" +x );

		item itemFinder = item.lookupFindItem(mtc.getDB(), x);

// set auction fields
		auctionTitle.setText("Auction Item");
		String reservedPrice = String.valueOf(itemFinder.getReservePrice());
		auctionReservePrice.setText(reservedPrice);
		String commissionBids = String.valueOf(itemFinder.getCommissionBidAmount());
		auctionCommissionBids.setText(commissionBids);
		auctionSold.setText("");
		auctionPrice.setText("");
		auctionClientNo.setText("");
		auctionComments.setText("");
		confirmSale.setText("");


		mtc.disconnect();
	}

	public void soldItem(ActionEvent event) throws Exception{
		// update auctioneer fields, mark as sold and calculate commission

		auctionSold.setText("Y");

		Double price = Double.parseDouble(auctionPrice.getText());

		Double commission = price*0.80;

		String commissionTaken = String.valueOf(commission);

		confirmSale.setText("Item sold. Commission: " +commission);

	}



	public void search(ActionEvent event) throws Exception{

	mtc = new MatisseConnector();
	mtc.connect();
// search for person
	Integer searcher = Integer.valueOf(idSearch.getText());
	person FindPerson = person.lookupFindPerson(mtc.getDB(), searcher);
	System.out.println(FindPerson.getFirstname());
	// Set TextFields to FindPerson getText
	titleSearch.setText(FindPerson.getTitle());
	firstnameSearch.setText(FindPerson.getFirstname());
	surnameSearch.setText(FindPerson.getSurname());
	addressSearch.setText(FindPerson.getAddress());
	telephoneSearch.setText(FindPerson.getNumber());
	emailSearch.setText(FindPerson.getEmail());
	statusSearch.setText(FindPerson.getStatus());
	approvedSearch.setText(FindPerson.getApproved());
	accountSearch.setText(FindPerson.getAccount());
	String sorting = String.valueOf(FindPerson.getSortcode());
	sortcodeSearch.setText(sorting);


	mtc.disconnect();
	}
}
