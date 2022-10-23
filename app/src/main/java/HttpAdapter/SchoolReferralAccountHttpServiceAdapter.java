package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class SchoolReferralAccountHttpServiceAdapter {


    String SOAP_ADDRESS ="http://edujunior.co.uk/WebServices/SchoolReferralAccountServices.asmx";


    public ArrayList<JSONObject> GetAllSchoolReferralAccount()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllSchoolReferralAccount";
        String OPERATION_NAME_GetJsonData = "GetAllSchoolReferralAccount";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

       // String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolReferralAccountServices.asmx";


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


    public String GetSchoolReferralAccountBySchoolReferralAccountId(String schoolReferralAccountId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolReferralAccountBySchoolReferralAccountId";
        String OPERATION_NAME_GetJsonData = "GetSchoolReferralAccountBySchoolReferralAccountId";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolReferralAccountServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolReferralAccountId", schoolReferralAccountId);
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


    public JSONObject GetSchoolReferralAccountByEduJuniorStaffId(String eduJuniorStaffId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolReferralAccountByEduJuniorStaffId";
        String OPERATION_NAME_GetJsonData = "GetSchoolReferralAccountByEduJuniorStaffId";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolReferralAccountServices.asmx";
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


//    public ArrayList<JSONObject> GetSchoolReferralAccountBySomicleStaffId(String somicleStaffId)
//    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolReferralAccountBySomicleStaffId";
//        String OPERATION_NAME_GetJsonData = "GetSchoolReferralAccountBySomicleStaffId";
//
//
//        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//
//        String SOAP_ADDRESS ="http://somicle.com/WebServices/SchoolReferralAccountServices.asmx";
//
//        SoapPrimitive response=null;
//
//        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects
//
//        try
//        {
//            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
//            request.addProperty("somicleStaffId", somicleStaffId);
//            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
//            envelope.dotNet = true;
//            envelope.setOutputSoapObject(request);
//            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
//            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
//
//            response = (SoapPrimitive) envelope.getResponse();
//
//
//
//
//            if(response.toString().length()>0 )
//            {
//                //String responseModified = "["+response+"]";
//
//                JSONArray aryJSONStrings  = new JSONArray(response.toString());
//                JSONObject jsonObj = new JSONObject();
//
//
//
//                for(int i=0; i<aryJSONStrings.length(); i++) {
//
//                    jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);
//
//                    obj.add(jsonObj);
//
//                }
//
//            }
//            else
//            {
//                obj = null;
//            }
//
//        }
//        catch (Exception exception)
//        {
//            obj = null;
//            exception.printStackTrace();
//            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
//        }
//
//        return obj;
//
//    }





    public String AddSchoolReferralAccount(String eduJuniorStaffId, String totalNoOfSchoolsReferred, String totalNoOfStudentsReferred, String noOfReferredStudentsUncleared,
                                           String amountToBeCleared, String totalAmountCleared, String dateLastCleared, String dateOfLastTransaction)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddSchoolReferralAccount";
        String OPERATION_NAME_GetJsonData = "AddSchoolReferralAccount";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";



        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolReferralAccountServices.asmx";

        SoapPrimitive response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("eduJuniorStaffId", eduJuniorStaffId);
            request.addProperty("totalNoOfSchoolsReferred", totalNoOfSchoolsReferred);
            request.addProperty("totalNoOfStudentsReferred", totalNoOfStudentsReferred);
            request.addProperty("noOfReferredStudentsUncleared", noOfReferredStudentsUncleared);
            request.addProperty("amountToBeCleared", amountToBeCleared);
            request.addProperty("totalAmountCleared", totalAmountCleared);
            request.addProperty("dateLastCleared", dateLastCleared);
            request.addProperty("dateOfLastTransaction", dateOfLastTransaction);



            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive)envelope.getResponse();
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
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return response.toString();

    }


    public String UpdateSchoolReferralAccount(String schoolReferralAccountId, String eduJuniorStaffId, String totalNoOfSchoolsReferred, String totalNoOfStudentsReferred, String noOfReferredStudentsUncleared,
                                              String amountToBeCleared, String totalAmountCleared, String dateLastCleared, String dateOfLastTransaction)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateSchoolReferralAccount";
        String OPERATION_NAME_GetJsonData = "UpdateSchoolReferralAccount";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolReferralAccountServices.asmx";

        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolReferralAccountId", schoolReferralAccountId);
            request.addProperty("eduJuniorStaffId", eduJuniorStaffId);
            request.addProperty("totalNoOfSchoolsReferred", totalNoOfSchoolsReferred);
            request.addProperty("totalNoOfStudentsReferred", totalNoOfStudentsReferred);
            request.addProperty("noOfReferredStudentsUncleared", noOfReferredStudentsUncleared);
            request.addProperty("amountToBeCleared", amountToBeCleared);
            request.addProperty("totalAmountCleared", totalAmountCleared);
            request.addProperty("dateLastCleared", dateLastCleared);
            request.addProperty("dateOfLastTransaction", dateOfLastTransaction);


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
