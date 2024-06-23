package GenericUtils;

public interface EndPoints {
ExcelUtility excel=new ExcelUtility();
	String bearerTocken="4b1d870391507f2cf7fecb8b9d51fe26cb5c203f9ad9d29a412a6c434765e2e8";
	String baseURL="https://gorest.co.in";
	String createAnewUser ="https://gorest.co.in/public/v2/users";
	String getOneUserDetails = "/public/v2/users/";
	String updateUserDetails = "/public/v2/users/User_ID";
	String deleteUser = "https://gorest.co.in/public/v2/users/";
	String basicAuth="https://gorest.co.in/consumer/login";
	
	String activeSatus="Active";
	String inActiveSatus="Inactive";
	 //String UserId= excel.getExcelData("UserIds", 2, 2);
}
//+ excel.getExcelData("UserIDs", 2, 2);