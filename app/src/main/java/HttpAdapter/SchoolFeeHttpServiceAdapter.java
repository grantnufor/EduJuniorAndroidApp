package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class SchoolFeeHttpServiceAdapter {

    public ArrayList<JSONObject> GetAllSchoolFees()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllSchoolFees";
        String OPERATION_NAME_GetJsonData = "GetAllSchoolFees";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolFeeServices.asmx";


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



    public ArrayList<JSONObject> GetAllSchoolFeeBySchoolId(String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllSchoolFeeBySchoolId";
        String OPERATION_NAME_GetJsonData = "GetAllSchoolFeeBySchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolFeeServices.asmx";


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



    public ArrayList<JSONObject> GetSchoolFeeByPupilIdAndSchoolId(String pupilId, String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolFeeByPupilIdAndSchoolId";
        String OPERATION_NAME_GetJsonData = "GetSchoolFeeByPupilIdAndSchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolFeeServices.asmx";


        SoapPrimitive response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilId", pupilId);
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




    public JSONObject GetSchoolFeeById(String schoolFeeId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolFeeById";
        String OPERATION_NAME_GetJsonData = "GetSchoolFeeById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolFeesServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolFeeId", schoolFeeId);
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



    public ArrayList<JSONObject> GetSchoolFeeByPupilIdAndSchoolIdAndSessionId(String pupilId, String schoolId, String sessionId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolFeeByPupilIdAndSchoolIdAndSessionId";
        String OPERATION_NAME_GetJsonData = "GetSchoolFeeByPupilIdAndSchoolIdAndSessionId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolFeesServices.asmx";


        SoapPrimitive response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilId", pupilId);
            request.addProperty("schoolId", schoolId);
            request.addProperty("sessionId", sessionId);
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






    public ArrayList<JSONObject> GetSchoolFeeByPupilIdAndSchoolIdAndTermIdAndSessionId(String pupilId, String schoolId, String termId, String sessionId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSchoolFeeByPupilIdAndSchoolIdAndTermIdAndSessionId";
        String OPERATION_NAME_GetJsonData = "GetSchoolFeeByPupilIdAndSchoolIdAndTermIdAndSessionId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolFeesServices.asmx";

        SoapPrimitive response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilId", pupilId);
            request.addProperty("schoolId", schoolId);
            request.addProperty("termId", termId);
            request.addProperty("sessionId", sessionId);
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





    public String AddSchoolFee ( String schoolFeeIdLocal, String sessionId, String sessionName, String termId, String termStartDate,
                                 String amountToPay, String amountToSomicle, String totalAmountToPay, String amountPaid,
                                 String balance, String pupilId, String assignedSms,  String schoolId, String uploaded, String remitted)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddSchoolFee";
        String OPERATION_NAME_GetJsonData = "AddSchoolFee";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";



        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolFeesServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        SoapPrimitive response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolFeeIdLocal", schoolFeeIdLocal);
            request.addProperty("sessionId", sessionId);
            request.addProperty("sessionName", sessionName);
            request.addProperty("termId", termId);
            request.addProperty("termStartDate", termStartDate);
            request.addProperty("amountToPay", amountToPay);
            request.addProperty("amountToSomicle", amountToSomicle);
            request.addProperty("totalAmountToPay", totalAmountToPay);
            request.addProperty("amountPaid", amountPaid);
            request.addProperty("balance", balance);
            request.addProperty("pupilId", pupilId);
            request.addProperty("assignedSms", assignedSms);
            request.addProperty("uploaded", uploaded);
            request.addProperty("schoolId", schoolId);
            request.addProperty("uploaded", uploaded);
            request.addProperty("remitted", remitted);


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


    public String UpdateSchoolFee (String schoolFeeId,  String schoolFeeIdLocal, String sessionId, String sessionName, String termId, String termStartDate,
                                 String amountToPay, String amountToSomicle, String totalAmountToPay, String amountPaid,
                                 String balance, String pupilId, String assignedSms,  String schoolId, String uploaded, String remitted)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateSchoolFee";
        String OPERATION_NAME_GetJsonData = "UpdateSchoolFee";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/SchoolFeesServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("schoolFeeId", schoolFeeId);
            request.addProperty("schoolFeeIdLocal", schoolFeeIdLocal);
            request.addProperty("sessionId", sessionId);
            request.addProperty("sessionName", sessionName);
            request.addProperty("termId", termId);
            request.addProperty("termStartDate", termStartDate);
            request.addProperty("amountToPay", amountToPay);
            request.addProperty("amountToSomicle", amountToSomicle);
            request.addProperty("totalAmountToPay", totalAmountToPay);
            request.addProperty("amountPaid", amountPaid);
            request.addProperty("balance", balance);
            request.addProperty("pupilId", pupilId);
            request.addProperty("assignedSms", assignedSms);
            request.addProperty("uploaded", uploaded);
            request.addProperty("schoolId", schoolId);
            request.addProperty("uploaded", uploaded);
            request.addProperty("remitted", remitted);


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
