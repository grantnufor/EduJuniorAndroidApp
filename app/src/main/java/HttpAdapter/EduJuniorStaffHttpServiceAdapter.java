package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

/**
 * Created by Chisom on 9/6/2018.
 */


public class EduJuniorStaffHttpServiceAdapter {

    public ArrayList<JSONObject> GetAllEduJuniorStaff()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllEduJuniorStaff";
        String OPERATION_NAME_GetJsonData = "GetAllEduJuniorStaff";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive) envelope.getResponse();




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


    public ArrayList<JSONObject> GetEduJuniorStaffByEmailAddressOrNameWildCard(String searchString)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetEduJuniorStaffByEmailAddressOrNameWildCard";
        String OPERATION_NAME_GetJsonData = "GetEduJuniorStaffByEmailAddressOrNameWildCard";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("searchString", searchString);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive) envelope.getResponse();




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



    public JSONObject GetEduJuniorStaffByEmailAddressAndPassword(String emailAddress, String password)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetEduJuniorStaffByEmailAddressAndPassword";
        String OPERATION_NAME_GetJsonData = "GetEduJuniorStaffByEmailAddressAndPassword";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("emailAddress", emailAddress);
            request.addProperty("password", password);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive) envelope.getResponse();
            jsonObj = new JSONObject(response.toString());

//            ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
//            if(response.toString().length()>0 )
//            {
//
//            }
//            else
//            {
//                //response="Empty";
//            }

        }
        catch (Exception exception)
        {
            //response="error: "+exception.toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return jsonObj;

    }


    public JSONObject GetEduJuniorStaffByEmailAddress(String emailAddress)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetEduJuniorStaffByEmailAddress";
        String OPERATION_NAME_GetJsonData = "GetEduJuniorStaffByEmailAddress";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("emailAddress", emailAddress);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive) envelope.getResponse();
            jsonObj = new JSONObject(response.toString());

//            ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
//            if(response.toString().length()>0 )
//            {
//
//            }
//            else
//            {
//                //response="Empty";
//            }

        }
        catch (Exception exception)
        {
            //response="error: "+exception.toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return jsonObj;

    }



    public JSONObject GetEduJuniorStaffByPhoneNumber(String phoneNumber)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetEduJuniorStaffByPhoneNumber";
        String OPERATION_NAME_GetJsonData = "GetEduJuniorStaffByPhoneNumber";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("phoneNumber", phoneNumber);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive) envelope.getResponse();
            jsonObj = new JSONObject(response.toString());

//            ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
//            if(response.toString().length()>0 )
//            {
//
//            }
//            else
//            {
//                //response="Empty";
//            }

        }
        catch (Exception exception)
        {
            //response="error: "+exception.toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return jsonObj;

    }




    public String GetEduJuniorStaffById(String eduJuniorStaffId)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetEduJuniorStaffById";
        String OPERATION_NAME_GetJsonData = "GetEduJuniorStaffById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("eduJuniorStaffId", eduJuniorStaffId);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive) envelope.getResponse();
            //JSONObject mainJson = new JSONObject(response.toString());

//            ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
//            if(response.toString().length()>0 )
//            {
//
//            }
//            else
//            {
//                //response="Empty";
//            }

        }
        catch (Exception exception)
        {
            //response="error: "+exception.toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return response.toString();

    }







    public String AddEduJuniorStaff(String firstName, String otherNames, String lastName, String sex, String homeAddress, String phoneNumber,
                                  String emailAddress, String password, String dateRegistered, String dateLastUpdated, String verified)
    {


        String returnMessage = "0";

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddEduJuniorStaff";
        String OPERATION_NAME_GetJsonData = "AddEduJuniorStaff";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";



        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        SoapPrimitive response=null;


        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("firstName", firstName);
            request.addProperty("otherNames", otherNames);
            request.addProperty("lastName", lastName);
            request.addProperty("sex", sex);
            request.addProperty("homeAddress", homeAddress);
            request.addProperty("phoneNumber", phoneNumber);
            request.addProperty("emailAddress", emailAddress);
            request.addProperty("password", password);
            request.addProperty("dateRegistered", dateRegistered);
            request.addProperty("dateLastUpdated", dateLastUpdated);
            request.addProperty("verified", verified);


            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive)envelope.getResponse();

            returnMessage = response.toString();
//            ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
//            if(response.toString().length()>0 )
//            {
//
//                String responseModified = "["+response+"]";
//
//                JSONArray aryJSONStrings  = new JSONArray(responseModified.toString());
//                JSONObject jsonObj = new JSONObject();
//
////		    int SNO=0;
//
//                for(int i=0; i<aryJSONStrings.length(); i++) {
//
//                    jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
//
//
//                }
//
//                response = jsonObj.get("Email");
//
//            }
//            else
//            {
//                response="Empty";
//            }

        }
        catch (Exception exception)
        {
            // response="error: "+exception.toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return returnMessage;

    }


    public String UpdateEduJuniorStaff(String eduJuniorStaffId, String firstName, String otherNames, String lastName, String sex, String homeAddress, String phoneNumber,
                                     String emailAddress, String password, String dateRegistered, String dateLastUpdated, String verified )
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateEduJuniorStaff";
        String OPERATION_NAME_GetJsonData = "UpdateEduJuniorStaff";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("eduJuniorStaffId", eduJuniorStaffId);
            request.addProperty("firstName", firstName);
            request.addProperty("otherNames", otherNames);
            request.addProperty("lastName", lastName);
            request.addProperty("sex", sex);
            request.addProperty("homeAddress", homeAddress);
            request.addProperty("phoneNumber", phoneNumber);
            request.addProperty("emailAddress", emailAddress);
            request.addProperty("password", password);
            request.addProperty("dateRegistered", dateRegistered);
            request.addProperty("dateLastUpdated", dateLastUpdated);
            request.addProperty("verified", verified);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = envelope.getResponse();


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
