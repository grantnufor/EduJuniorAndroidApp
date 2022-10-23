package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class StaffSchoolEngagementHttpServiceAdapter {


    String SOAP_ADDRESS ="http://edujunior.co.uk/WebServices/StaffSchoolEngagementServices.asmx";

    public ArrayList<JSONObject> GetAllStaffSchoolEngagements()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllStaffSchoolEngagements";
        String OPERATION_NAME_GetJsonData = "GetAllStaffSchoolEngagements";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/StaffSchoolEngagementServices.asmx";


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


    public String GetStaffSchoolEngagementById(String staffSchoolEngagementId)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetStaffSchoolEngagementById";
        String OPERATION_NAME_GetJsonData = "GetStaffSchoolEngagementById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/StaffSchoolEngagementServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("staffSchoolEngagementId", staffSchoolEngagementId);
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




    public ArrayList<JSONObject> GetStaffSchoolEngagementBySchoolName(String schoolName)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetStaffSchoolEngagementBySchoolName";
        String OPERATION_NAME_GetJsonData = "GetStaffSchoolEngagementBySchoolName";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/StaffSchoolEngagementServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolName", schoolName);
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



    public ArrayList<JSONObject> GetStaffSchoolEngagementBySomicleStaffId(String somicleStaffId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetStaffSchoolEngagementBySomicleStaffId";
        String OPERATION_NAME_GetJsonData = "GetStaffSchoolEngagementBySomicleStaffId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/StaffSchoolEngagementServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("somicleStaffId", somicleStaffId);
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

    public JSONObject GetStaffSchoolEngagementBySchoolNameAndLocationId(String schoolName, String locationId)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetStaffSchoolEngagementBySchoolNameAndLocationId";
        String OPERATION_NAME_GetJsonData = "GetStaffSchoolEngagementBySchoolNameAndLocationId";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/StaffSchoolEngagementServices.asmx";
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



    public ArrayList<JSONObject> GetStaffSchoolEngagementBySchoolNameWildCard(String schoolName)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetStaffSchoolEngagementBySchoolNameWildCard";
        String OPERATION_NAME_GetJsonData = "GetStaffSchoolEngagementBySchoolNameWildCard";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/StaffSchoolEngagementServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolName", schoolName);
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



    public String AddStaffSchoolEngagement(String schoolName, String locationId, String locationName, String somicleStaffId, String staffName, String phoneNoOfSchoolContact, String dateOfEngagement)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddStaffSchoolEngagement";
        String OPERATION_NAME_GetJsonData = "AddStaffSchoolEngagement";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";



        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/StaffSchoolEngagementServices.asmx";

        SoapPrimitive response=null;



        String returnMessage = "0";

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolName", schoolName);
            request.addProperty("locationId", locationId);
            request.addProperty("locationName", locationName);
            request.addProperty("eduJuniorStaffId", somicleStaffId);
            request.addProperty("staffName", staffName);
            request.addProperty("phoneNoOfSchoolContact", phoneNoOfSchoolContact);
            request.addProperty("dateOfEngagement", dateOfEngagement);




            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
            response = (SoapPrimitive)envelope.getResponse();

            returnMessage = response.toString();



        }
        catch (Exception exception)
        {
            // response="error: "+exception.toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return returnMessage.toString();

    }


    public String UpdateStaffSchoolEngagement(String staffSchoolEngagementId, String schoolName, String locationId, String locationName, String eduJuniorStaffId, String staffName, String phoneNoOfSchoolContact, String dateOfEngagement)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateStaffSchoolEngagement";
        String OPERATION_NAME_GetJsonData = "UpdateStaffSchoolEngagement";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/StaffSchoolEngagementServices.asmx";

        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolName", schoolName);
            request.addProperty("locationId", locationId);
            request.addProperty("locationName", locationName);
            request.addProperty("eduJuniorStaffId", eduJuniorStaffId);
            request.addProperty("staffName", staffName);
            request.addProperty("phoneNoOfSchoolContact", phoneNoOfSchoolContact);
            request.addProperty("dateOfEngagement", dateOfEngagement);


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
