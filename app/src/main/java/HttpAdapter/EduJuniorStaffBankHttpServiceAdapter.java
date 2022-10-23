package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class EduJuniorStaffBankHttpServiceAdapter {


    String SOAP_ADDRESS ="http://edujunior.co.uk/WebServices/EduJuniorStaffBankServices.asmx";


    public ArrayList<JSONObject> GetAllEduJuniorStaffBanks()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllSomicleStaffBanks";
        String OPERATION_NAME_GetJsonData = "GetAllEduJuniorStaffBanks";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffBankServices.asmx";

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


    public String GetEduJuniorStaffBankByEduJuniorStaffBankId(String eduJuniorStaffBankId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetEduJuniorStaffBankByEduJuniorStaffBankId";
        String OPERATION_NAME_GetJsonData = "GetEduJuniorStaffBankByEduJuniorStaffBankId";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffBankServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("eduJuniorStaffBankId", eduJuniorStaffBankId);
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


    public JSONObject GetEduJuniorStaffBankByEduJuniorStaffId(String eduJuniorStaffId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetEduJuniorStaffBankByEduJuniorStaffId";
        String OPERATION_NAME_GetJsonData = "GetEduJuniorStaffBankByEduJuniorStaffId";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffBankServices.asmx";
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

        return jsonObj;

    }




    public String AddEduJuniorStaffBank(String bankName, String accountName, String accountNo, String sortCode,
                                      String dateAdded, String dateLastUpdated, String eduJuniorStaffId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddEduJuniorStaffBank";
        String OPERATION_NAME_GetJsonData = "AddEduJuniorStaffBank";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffBankServices.asmx";

        SoapPrimitive response=null;

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("bankName", bankName);
            request.addProperty("accountName", accountName);
            request.addProperty("accountNo", accountNo);
            request.addProperty("sortCode", sortCode);
            request.addProperty("dateAdded", dateAdded);
            request.addProperty("dateLastUpdated", dateLastUpdated);
            request.addProperty("eduJuniorStaffId", eduJuniorStaffId);



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


    public String UpdateEduJuniorStaffBank(String eduJuniorStaffBankId, String bankName, String accountName, String accountNo, String sortCode,
                                         String dateAdded, String dateLastUpdated, String eduJuniorStaffId )
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateEduJuniorStaffBank";
        String OPERATION_NAME_GetJsonData = "UpdateEduJuniorStaffBank";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/EduJuniorStaffBankServices.asmx";

        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("eduJuniorStaffBankId", eduJuniorStaffBankId);
            request.addProperty("bankName", bankName);
            request.addProperty("accountName", accountName);
            request.addProperty("accountNo", accountNo);
            request.addProperty("sortCode", sortCode);
            request.addProperty("dateAdded", dateAdded);
            request.addProperty("dateLastUpdated", dateLastUpdated);
            request.addProperty("eduJuniorStaffId", eduJuniorStaffId);


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
