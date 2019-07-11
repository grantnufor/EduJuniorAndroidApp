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
 * Created by Chisom on 5/22/2018.
 */

public class SchoolHttpServiceAdapter {

    public ArrayList<JSONObject> GetAllSchool()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllSchool";
        String OPERATION_NAME_GetJsonData = "GetAllSchool";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolServices.asmx";


        SoapPrimitive response=null;

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


    public JSONObject GetSchoolByEmailAddressAndPassword(String emailAddress, String password)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolByEmailAddressAndPassword";

        String OPERATION_NAME_GetJsonData = "GetSchoolByEmailAddressAndPassword";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolServices.asmx";
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



    public JSONObject GetSchoolByEmailAddress(String emailAddress)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolByEmailAddress";
        String OPERATION_NAME_GetJsonData = "GetSchoolByEmailAddress";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolServices.asmx";
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





    public JSONObject GetSchoolById(String schoolId)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolById";
        String OPERATION_NAME_GetJsonData = "GetSchoolById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolId", schoolId);
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





    public ArrayList<JSONObject> GetSchoolByLocationId(String locationId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolByLocationId";
        String OPERATION_NAME_GetJsonData = "GetSchoolByLocationId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolServices.asmx";

        SoapPrimitive response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("locationId", locationId);
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



    public String GetSchoolBySchoolNameAndLocationId(String schoolName, String locationId)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolBySchoolNameAndLocationId";
        String OPERATION_NAME_GetJsonData = "GetSchoolBySchoolNameAndLocationId";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolName", schoolName);
            request.addProperty("locationId", locationId);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive) envelope.getResponse();

        }
        catch (Exception exception)
        {
            //response="error: "+exception.toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return response.toString();

    }



    public String AddSchool(String schoolName, String address, String phoneNo, String emailAddress, String password, String locationName,
                            String proprietorFullName, String headFullName, String dateAdded, String dateLastUpdated, String regKey, String active, String uploaded)
    {


        String returnMessage = "0";

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddSchool";
        String OPERATION_NAME_GetJsonData = "AddSchool";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolServices.asmx";


        SoapPrimitive response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolName", schoolName);
            request.addProperty("address", address);
            request.addProperty("phoneNo", phoneNo);
            request.addProperty("emailAddress", emailAddress);
            request.addProperty("password", password);
            request.addProperty("locationName", locationName);
            request.addProperty("phoneNo", phoneNo);
            request.addProperty("proprietorFullName", proprietorFullName);
            request.addProperty("headFullName", headFullName);
            request.addProperty("dateAdded", dateAdded);
            request.addProperty("dateLastUpdated", dateLastUpdated);
            request.addProperty("regKey", regKey);
            request.addProperty("active", active);
            request.addProperty("uploaded", uploaded);


            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive)envelope.getResponse();

            returnMessage = response.toString();
            //JSONObject mainJson = new JSONObject(response.toString());

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
            returnMessage = exception.getMessage().toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return returnMessage;

    }


    public String UpdateSchool(String schoolId, String schoolName, String address, String phoneNo, String emailAddress, String password, String locationName,
                               String proprietorFullName, String headFullName, String dateAdded, String dateLastUpdated, String regKey, String active , String uploaded)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateSchool";
        String OPERATION_NAME_GetJsonData = "UpdateSchool";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolId", schoolId);
            request.addProperty("schoolName", schoolName);
            request.addProperty("address", address);
            request.addProperty("phoneNo", phoneNo);
            request.addProperty("emailAddress", emailAddress);
            request.addProperty("password", password);
            request.addProperty("locationName", locationName);
            request.addProperty("phoneNo", phoneNo);
            request.addProperty("proprietorFullName", proprietorFullName);
            request.addProperty("headFullName", headFullName);
            request.addProperty("dateAdded", dateAdded);
            request.addProperty("dateLastUpdated", dateLastUpdated);
            request.addProperty("regKey", regKey);
            request.addProperty("active", active);
            request.addProperty("uploaded", uploaded);


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
