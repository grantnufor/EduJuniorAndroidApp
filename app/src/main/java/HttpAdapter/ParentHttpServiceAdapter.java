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
 * Created by Chisom on 5/29/2018.
 */

public class ParentHttpServiceAdapter {


    String SOAP_ADDRESS ="http://edujunior.co.uk/WebServices/ParentServices.asmx";

    public ArrayList<JSONObject> GetAllParents()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllParents";
        String OPERATION_NAME_GetJsonData = "GetAllParents";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

       // String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";


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



    public ArrayList<JSONObject> GetParentByNameOrPhoneNumberWildCard(String strSearch)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetParentByNameOrPhoneNumberWildCard";
        String OPERATION_NAME_GetJsonData = "GetParentByNameOrPhoneNumberWildCard";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("strSearch", strSearch);
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

    public ArrayList<JSONObject> GetParentByNamesOrPhoneNumber(String strSearch)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetParentByNamesOrPhoneNumber";
        String OPERATION_NAME_GetJsonData = "GetParentByNamesOrPhoneNumber";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("strSearch", strSearch);
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


    public JSONObject GetParentByEmailAddressAndPassword(String emailAddress, String password)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetParentByEmailAddressAndPassword";
        String OPERATION_NAME_GetJsonData = "GetParentByEmailAddressAndPassword";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";
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




    public JSONObject GetParentByEmailAddress(String emailAddress)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetParentByEmailAddress";
        String OPERATION_NAME_GetJsonData = "GetParentByEmailAddress";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";
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





    public JSONObject GetParentByPhoneNumberAndPassword(String phoneNumber, String password)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetParentByPhoneNumberAndPassword";
        String OPERATION_NAME_GetJsonData = "GetParentByPhoneNumberAndPassword";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";
        SoapPrimitive response=null;


        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("phoneNumber", phoneNumber);
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




    public JSONObject GetParentByPhoneNumber(String phoneNumber)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetParentByPhoneNumber";
        String OPERATION_NAME_GetJsonData = "GetParentByPhoneNumber";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";
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




    public JSONObject GetParentById(String parentId)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetParentById";
        String OPERATION_NAME_GetJsonData = "GetParentById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("parentId", parentId);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

//            response = (SoapPrimitive) envelope.getResponse();
//            //JSONObject mainJson = new JSONObject(response.toString());


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







    public String AddParent(String parentIdLocal, String title, String firstName, String otherNames, String lastName, String sex, String homeAddress, String phoneNumber,
                            String emailAddress, String password, String dateRegistered, String dateLastUpdated, String uploaded)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddParent";
        String OPERATION_NAME_GetJsonData = "AddParent";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";



       // String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";

        SoapPrimitive response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("parentIdLocal", parentIdLocal);
            request.addProperty("title", title);
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
            request.addProperty("uploaded", uploaded);



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


    public String UpdateParent(String parentId, String parentIdLocal,  String title, String firstName, String otherNames, String lastName, String sex, String homeAddress, String phoneNumber,
                               String emailAddress, String password, String dateRegistered, String dateLastUpdated, String uploaded)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateParent";
        String OPERATION_NAME_GetJsonData = "UpdateParent";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ParentServices.asmx";

        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("parentId", parentId);
            request.addProperty("parentIdLocal", parentIdLocal);
            request.addProperty("title", title);
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
