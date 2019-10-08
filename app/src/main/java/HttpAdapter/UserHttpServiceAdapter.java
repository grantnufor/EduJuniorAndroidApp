package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class UserHttpServiceAdapter {


	String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/UserServices.asmx";

	public JSONObject GetUserByEmailAndPassword(String email, String password)
	{ 
	  String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByEmailAndPassword";
	  String OPERATION_NAME_GetJsonData = "GetUserByEmailAndPassword";
	 
	  String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//	  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
	  Object response=null;
	  
	  JSONObject jsonObj = new JSONObject();
	  
	  try
	  {
	   SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
	   request.addProperty("email", email);
	   request.addProperty("password", password);
	   SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	   envelope.dotNet = true;
	   envelope.setOutputSoapObject(request);
	      HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
	   httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
	   
	   response = envelope.getResponse();
	   //JSONObject mainJson = new JSONObject(response.toString());
	    
	   ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
	   if(response.toString().length()>0 )
	   {
//	       
		   String responseModified = "["+response+"]";
		   
		   JSONArray aryJSONStrings  = new JSONArray(responseModified.toString());
		   //JSONObject jsonObj = new JSONObject();
	   
//	    int SNO=0;
	    
	    for(int i=0; i<aryJSONStrings.length(); i++) {
	    	
	    	jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
	    	

	     
	    }
	    
	    //response = jsonObj.get("Email");
	    
	   }
	   else 
	   {
	    //response="Empty";
	   }

	  }
	  catch (Exception exception)
	  {
	   //response="error: "+exception.toString();
	   exception.printStackTrace();
	   //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
	  }
	  
	  return jsonObj;
	 
	 }
	
	
	
	public JSONObject GetUserByPhoneNo(String phoneNo)
	{ 
	  String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByPhoneNo";
	  String OPERATION_NAME_GetJsonData = "GetUserByPhoneNo";
	 
	  String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//	  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
	  Object response=null;
	  
	  JSONObject jsonObj = new JSONObject();
	  
	  try
	  {
	   SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
	   request.addProperty("phoneNo", phoneNo);
	   SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	   envelope.dotNet = true;
	   envelope.setOutputSoapObject(request);
	      HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
	   httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
	   
	   response = envelope.getResponse();
	   //JSONObject mainJson = new JSONObject(response.toString());
	    
	   ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
	   if(response.toString().length()>0 )
	   {
//	       
		   String responseModified = "["+response+"]";
		   
		   JSONArray aryJSONStrings  = new JSONArray(responseModified.toString());
		   //JSONObject jsonObj = new JSONObject();
	   
//	    int SNO=0;
	    
	    for(int i=0; i<aryJSONStrings.length(); i++) {
	    	
	    	jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
	    	

	     
	    }
	    
	    //response = jsonObj.get("Email");
	    
	   }
	   else 
	   {
	    //response="Empty";
	   }

	  }
	  catch (Exception exception)
	  {
	   //response="error: "+exception.toString();
	   exception.printStackTrace();
	   //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
	  }
	  
	  return jsonObj;
	 
	 }


	public JSONObject GetUserByEmail(String email)
	{
		String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByEmail";
		String OPERATION_NAME_GetJsonData = "GetUserByEmail";

		String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//	  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
		Object response=null;

		JSONObject jsonObj = new JSONObject();

		try
		{
			SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
			request.addProperty("email", email);
			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
			envelope.dotNet = true;
			envelope.setOutputSoapObject(request);
			HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
			httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

			response = envelope.getResponse();
			//JSONObject mainJson = new JSONObject(response.toString());

			///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
			if(response.toString().length()>0 )
			{
//
				String responseModified = "["+response+"]";

				JSONArray aryJSONStrings  = new JSONArray(responseModified.toString());
				//JSONObject jsonObj = new JSONObject();

//	    int SNO=0;

				for(int i=0; i<aryJSONStrings.length(); i++) {

					jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);



				}

				//response = jsonObj.get("Email");

			}
			else
			{
				//response="Empty";
			}

		}
		catch (Exception exception)
		{
			//response="error: "+exception.toString();
			exception.printStackTrace();
			//Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
		}

		return jsonObj;

	}
	
	
	public JSONObject GetUserByUserId(long userId)
	{ 
	  String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserId";
	  String OPERATION_NAME_GetJsonData = "GetUserByUserId";
	 
	  String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//	  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
	  Object response=null;
	  
	  JSONObject jsonObj = new JSONObject();
	  
	  try
	  {
	   SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
	   request.addProperty("userId", userId);
	   SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	   envelope.dotNet = true;
	   envelope.setOutputSoapObject(request);
	      HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
	   httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
	   
	   response = envelope.getResponse();
	   //JSONObject mainJson = new JSONObject(response.toString());
	    
	   ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
	   if(response.toString().length()>0 )
	   {
//	       
		   String responseModified = "["+response+"]";
		   
		   JSONArray aryJSONStrings  = new JSONArray(responseModified.toString());
		   //JSONObject jsonObj = new JSONObject();
	   
//	    int SNO=0;
	    
	    for(int i=0; i<aryJSONStrings.length(); i++) {
	    	
	    	jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
	    	

	     
	    }
	    
	    //response = jsonObj.get("Email");
	    
	   }
	   else 
	   {
	    //response="Empty";
	   }

	  }
	  catch (Exception exception)
	  {
	   //response="error: "+exception.toString();
	   exception.printStackTrace();
	   //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
	  }
	  
	  return jsonObj;
	 
	 }
	
	
	
	public ArrayList<JSONObject> GetAllUsers()
	{ 
	  String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllUsers";
	  String OPERATION_NAME_GetJsonData = "GetAllUsers";
	 
	  String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//	  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
	  Object response=null;
	  
	  ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects
	  
	  try
	  {
	   SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
	   SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	   envelope.dotNet = true;
	   envelope.setOutputSoapObject(request);
	      HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
	   httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
	   
	   response = envelope.getResponse();

	   
	  
	   
	   if(response.toString().length()>0 )
	   {       
		   //String responseModified = "["+response+"]";
		   
		   JSONArray aryJSONStrings  = new JSONArray(response.toString());
		   JSONObject jsonObj = new JSONObject();

	    
	    for(int i=0; i<aryJSONStrings.length(); i++) {
	    	
	    	jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
	    	
	    	obj.add(jsonObj);
	     
	    }
	    
	    
	    
	   }
	   else 
	   {
	     obj = null;
	   }

	  }
	  catch (Exception exception)
	  {
	   obj = null;
	   exception.printStackTrace();
	   //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
	  }
	  
	  return obj;
	 
	 }
	
	
	
//	public ArrayList<JSONObject> GetUserByEmialAndPhoneNoAndNameWildCardSearch(String searchString)
//	{
//	  String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByEmialAndPhoneNoAndNameWildCardSearch";
//	  String OPERATION_NAME_GetJsonData = "GetUserByEmialAndPhoneNoAndNameWildCardSearch";
//
//	  String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
////	  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
//	  Object response=null;
//
//	  ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects
//
//	  try
//	  {
//	   SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
//	   request.addProperty("searchString", searchString);
//	   SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
//	   envelope.dotNet = true;
//	   envelope.setOutputSoapObject(request);
//	      HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
//	   httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
//
//	   response = envelope.getResponse();
//
//
//
//
//	   if(response.toString().length()>0 )
//	   {
//		   //String responseModified = "["+response+"]";
//
//		   JSONArray aryJSONStrings  = new JSONArray(response.toString());
//		   JSONObject jsonObj = new JSONObject();
//
//
//	    for(int i=0; i<aryJSONStrings.length(); i++) {
//
//	    	jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
//
//	    	obj.add(jsonObj);
//
//	    }
//
//
//
//	   }
//	   else
//	   {
//	     obj = null;
//	   }
//
//	  }
//	  catch (Exception exception)
//	  {
//	   obj = null;
//	   exception.printStackTrace();
//	   //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
//	  }
//
//	  return obj;
//
//	 }
	
	
	
	  public String RegisterUser(String firstName, String surname, String otherNames, String sex, String email, String phoneNo, String password, String dateCreated,  String dateLastUpdated, String status, String profilePicture,  String userCategoryId)
		 { 
		  String SOAP_ACTION_GetJsonData ="http://tempuri.org/CreateUser";
		  String OPERATION_NAME_GetJsonData = "CreateUser";
		 
		  String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
		 // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
		  Object response=null;
		  try
		  {
		   SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
		   request.addProperty("firstName", firstName);
		   request.addProperty("surname", surname);
		   request.addProperty("otherNames", otherNames);
		   request.addProperty("sex", sex);
		   request.addProperty("email", email);
		   request.addProperty("phoneNo", phoneNo);
		   request.addProperty("password", password);
		   request.addProperty("dateCreated", dateCreated);
		   request.addProperty("dateLastUpdated", dateLastUpdated);
		   request.addProperty("status", status);
		   request.addProperty("profilePicture", profilePicture);
		   request.addProperty("userCategoryId", userCategoryId);


	
		   
		   SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		   envelope.dotNet = true;
		   envelope.setOutputSoapObject(request);
		      HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
		   httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
		   
		   response = envelope.getResponse();
		   //JSONObject mainJson = new JSONObject(response.toString());
		    
		   ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
		   if(response.toString().length()>0 )
		   {
		       
			   String responseModified = "["+response+"]";
			   
			   JSONArray aryJSONStrings  = new JSONArray(responseModified.toString());
			   JSONObject jsonObj = new JSONObject();
		   
//		    int SNO=0;
		    
		    for(int i=0; i<aryJSONStrings.length(); i++) {
		    	
		    	jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
		    	
		     
		    }
		    
		    response = jsonObj.get("Email");
		    
		   }
		   else 
		   {
		    response="Empty";
		   }

		  }
		  catch (Exception exception)
		  {
		   response="error: "+exception.toString();
		   exception.printStackTrace();
		   //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
		  }
		  
		  return response.toString();
		 
		 }
	
	  
	  public String UpdateUser(long userId, String firstName, String surname, String otherNames, String sex, String dateOfBirth, String email, String phoneNo, String password, String dateCreated, String registrationType, String dateLastUpdated, String status, String profilePicture, String departmentId, String institutionId, String siteVisitCount, String userCategoryId)
		 { 
		  String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateUser";
		  String OPERATION_NAME_GetJsonData = "UpdateUser";
		 
		  String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
		 // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
		  Object response=null;
		  try
		  {
		   SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
			  request.addProperty("userId", userId);
			  request.addProperty("firstName", firstName);
			  request.addProperty("surname", surname);
			  request.addProperty("otherNames", otherNames);
			  request.addProperty("sex", sex);
			  request.addProperty("dateOfBirth", dateOfBirth);
			  request.addProperty("email", email);
			  request.addProperty("phoneNo", phoneNo);
			  request.addProperty("password", password);
			  request.addProperty("dateCreated", dateCreated);
			  request.addProperty("registrationType", registrationType);
			  request.addProperty("dateLastUpdated", dateLastUpdated);
			  request.addProperty("status", status);
			  request.addProperty("profilePicture", profilePicture);
			  request.addProperty("departmentId", departmentId);
			  request.addProperty("institutionId", institutionId);
			  request.addProperty("siteVisitCount", siteVisitCount);
			  request.addProperty("userCategoryId", userCategoryId);

		   
		   SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		   envelope.dotNet = true;
		   envelope.setOutputSoapObject(request);
		      HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
		   httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
		   
		   response = envelope.getResponse();
		   //JSONObject mainJson = new JSONObject(response.toString());
		    
		   ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
//		   if(response.toString().length()>0 )
//		   {
////		       
//			   String responseModified = "["+response+"]";
//			   
//			   JSONArray aryJSONStrings  = new JSONArray(responseModified.toString());
//			   JSONObject jsonObj = new JSONObject();
//		   
////		    int SNO=0;
//		    
//		    for(int i=0; i<aryJSONStrings.length(); i++) {
//		    	
//		    	jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
//		    	
//
//		     
//		    }
//		    
//		    response = jsonObj.get("Email");
//		    
//		   }
//		   else 
//		   {
//		    response="Empty";
//		   }

		  }
		  catch (Exception exception)
		  {
		   response="error: "+exception.toString();
		   exception.printStackTrace();
		   //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
		  }
		  
		  return response.toString();
		 
		 }
	  
	  
	 
	
}
