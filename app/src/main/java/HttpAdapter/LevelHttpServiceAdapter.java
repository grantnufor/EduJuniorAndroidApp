package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class LevelHttpServiceAdapter {


    String SOAP_ADDRESS ="http://edujunior.co.uk/WebServices/LevelServices.asmx";


    public ArrayList<JSONObject> GetAllLevels()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllLevels";
        String OPERATION_NAME_GetJsonData = "GetAllLevels";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/LevelServices.asmx";


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


//    public JSONObject GetLevelByLevelNameAndSchoolId(String levelName, String schoolId)
//    {
////        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetLevelByLevelNameAndSchoolId";
//        String OPERATION_NAME_GetJsonData = "GetLevelByLevelNameAndSchoolId";
//
//        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/LevelServices.asmx";
//        SoapObject response=null;
//
//        JSONObject jsonObj = new JSONObject();
//
//        try
//        {
//            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
//            request.addProperty("levelName", levelName);
//            request.addProperty("schoolId", schoolId);
//            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
//            envelope.dotNet = true;
//            envelope.setOutputSoapObject(request);
//            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
//            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);
//
//
//
//            response = (SoapObject) envelope.getResponse();
//            if(!response.equals("")) {
//                jsonObj = new JSONObject(response.toString());
//            }
//
////            ///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
////            if(response.toString().length()>0 )
////            {
////
////            }
////            else
////            {
////                //response="Empty";
////            }
//
//        }
//        catch (Exception exception)
//        {
//            //response="error: "+exception.toString();
//            exception.printStackTrace();
//            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
//        }
//
//        return jsonObj;
//
//    }



    public JSONObject GetLevelByLevelNameAndSchoolId(String levelName, String schoolId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetLevelByLevelNameAndSchoolId";
        String OPERATION_NAME_GetJsonData = "GetLevelByLevelNameAndSchoolId";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/LevelServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("levelName", levelName);
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




    public JSONObject GetLevelById(String levelId)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetLevelById";
        String OPERATION_NAME_GetJsonData = "GetLevelById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/LevelServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("levelId", levelId);
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



    public ArrayList<JSONObject> GetLevelByLevelNameWildCardAndSchoolId(String levelName, String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetLevelByLevelNameWildCardAndSchoolId";
        String OPERATION_NAME_GetJsonData = "GetLevelByLevelNameWildCardAndSchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/LevelServices.asmx";

        SoapPrimitive response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("levelName", levelName);
            request.addProperty("schoolId", schoolId);
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



    public ArrayList<JSONObject> GetLevelBySchoolId(String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetLevelBySchoolId";
        String OPERATION_NAME_GetJsonData = "GetLevelBySchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/LevelServices.asmx";

        SoapPrimitive response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

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





    public String AddLevel ( String levelIdLocal, String levelName, String schoolId, String uploaded)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddLevel";
        String OPERATION_NAME_GetJsonData = "AddLevel";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/LevelServices.asmx";

        SoapPrimitive response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("levelIdLocal", levelIdLocal);
            request.addProperty("levelName", levelName);
            request.addProperty("schoolId", schoolId);
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


    public String UpdateLevel (String levelId, String levelIdLocal, String levelName, String schoolId, String uploaded )
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateLevel";
        String OPERATION_NAME_GetJsonData = "UpdateLevel";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        //String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/LevelServices.asmx";

        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("levelId", levelId);
            request.addProperty("levelIdLocal", levelIdLocal);
            request.addProperty("levelName", levelName);
            request.addProperty("schoolId", schoolId);
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
