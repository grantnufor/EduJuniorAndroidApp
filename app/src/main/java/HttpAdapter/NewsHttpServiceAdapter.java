package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class NewsHttpServiceAdapter {

    String SOAP_ADDRESS ="http://edujunior.co.uk/WebServices/NewsServices.asmx";

    public JSONObject GetNewById(String newsId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetNewById";
        String OPERATION_NAME_GetJsonData = "GetNewById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://studyair.com/WebServices/NewsServices.asmx";
        Object response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("newsId", newsId);
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



    public ArrayList<JSONObject> GetAllNews()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllNews";
        String OPERATION_NAME_GetJsonData = "GetAllNews";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS = "http://junior.landoria.org/WebServices/NewsServices.asmx";
        //String SOAP_ADDRESS ="http://studyair.com/WebServices/NewsServices.asmx";
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


    public ArrayList<JSONObject> GetNewsByRange(String range)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetNewsByRange";
        String OPERATION_NAME_GetJsonData = "GetNewsByRange";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS = "http://junior.landoria.org/WebServices/NewsServices.asmx";
        //String SOAP_ADDRESS ="http://studyair.com/WebServices/NewsServices.asmx";
        Object response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("range", range);
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




    public String AddNews(String newsHeading, String newsContent, String externalUrl, String dateAdded, String uploadedBy)
    {


        String returnMessage = "0";

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddNews";
        String OPERATION_NAME_GetJsonData = "AddNews";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS = "http://junior.landoria.org/WebServices/NewsServices.asmx";
        //String SOAP_ADDRESS ="http://studyair.com/WebServices/NewsServices.asmx";
        Object response=null;

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("newsHeading", newsHeading);
            request.addProperty("newsContent", newsContent);
            request.addProperty("externalUrl", externalUrl);
            request.addProperty("dateAdded", dateAdded);
            request.addProperty("uploadedBy", uploadedBy);





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
            response="error: "+exception.toString();
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return returnMessage;

    }


    public String UpdateNews(long newsId, String newsHeading, String newsContent, String externalUrl, String dateAdded, String uploadedBy)
    {


        String returnMessage = "0";

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateNews";
        String OPERATION_NAME_GetJsonData = "UpdateNews";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS = "http://junior.landoria.org/WebServices/NewsServices.asmx";
        //String SOAP_ADDRESS ="http://studyair.com/WebServices/NewsServices.asmx";
        Object response=null;


        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("newsId", newsId);
            request.addProperty("newsHeading", newsHeading);
            request.addProperty("newsContent", newsContent);
            request.addProperty("externalUrl", externalUrl);
            request.addProperty("dateAdded", dateAdded);
            request.addProperty("uploadedBy", uploadedBy);


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
