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

public class PupilHttpServiceAdapter {


    public ArrayList<JSONObject> GetAllPupils()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllPupils";
        String OPERATION_NAME_GetJsonData = "GetAllPupils";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";


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


    public String GetPupilById(String pupilId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetPupilById";
        String OPERATION_NAME_GetJsonData = "GetPupilById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilId", pupilId);
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




    public String GetPupilByFirstNameOtherNamesLastNameAndSchoolId(String firstName, String otherNames, String lastName, String schoolId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetPupilByFirstNameOtherNamesLastNameAndSchoolId";
        String OPERATION_NAME_GetJsonData = "GetPupilByFirstNameOtherNamesLastNameAndSchoolId";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("firstName", firstName);
            request.addProperty("otherNames", otherNames);
            request.addProperty("lastName", lastName);
            request.addProperty("schoolId", schoolId);
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




    public ArrayList<JSONObject> GetPupilByClassId(String classId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetPupilByClassId";
        String OPERATION_NAME_GetJsonData = "GetPupilByClassId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("classId", classId);
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



    public ArrayList<JSONObject> GetPupilBySchoolId(String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetPupilBySchoolId";
        String OPERATION_NAME_GetJsonData = "GetPupilBySchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";


        SoapPrimitive response = null;

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




    public ArrayList<JSONObject> GetPupilByPupilNameWildCardAndClassNameAndSchoolId(String pupilNameWildCard, String className, String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetPupilByPupilNameWildCardAndClassNameAndSchoolId";
        String OPERATION_NAME_GetJsonData = "GetPupilByPupilNameWildCardAndClassNameAndSchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of json object to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilNameWildCard", pupilNameWildCard);
            request.addProperty("className", className);
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




    public ArrayList<JSONObject> GetPupilBySchoolIdAndLevelId(String schoolId, String levelId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetPupilBySchoolIdAndLevelId";
        String OPERATION_NAME_GetJsonData = "GetPupilBySchoolIdAndLevelId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of json object to capture all returned objects

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


    public ArrayList<JSONObject> GetPupilByParentId(String parentId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetPupilByParentId";
        String OPERATION_NAME_GetJsonData = "GetPupilByParentId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";


        SoapPrimitive response = null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("parentId", parentId);
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



    public String AddPupil(String pupilIdLocal, String firstName, String otherNames, String lastName, String sex, String dateOfBirthDay,
                           String dateOfBirthMonth, String dateOfBirthYear, String homeAddress,
                           String phoneNumber, String parentId, String classId, String levelId, String schoolId, String dateEnroled, String dateRegistered,
                           String dateLastUpdated, String uploaded)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddPupil";
        String OPERATION_NAME_GetJsonData = "AddPupil";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";



        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        SoapPrimitive response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilIdLocal", pupilIdLocal);
            request.addProperty("firstName", firstName);
            request.addProperty("otherNames", otherNames);
            request.addProperty("lastName", lastName);
            request.addProperty("sex", sex);
            request.addProperty("dateOfBirthDay", dateOfBirthDay);
            request.addProperty("dateOfBirthMonth", dateOfBirthMonth);
            request.addProperty("dateOfBirthYear", dateOfBirthYear);
            request.addProperty("homeAddress", homeAddress);
            request.addProperty("phoneNumber", phoneNumber);
            request.addProperty("parentId", parentId);
            request.addProperty("classId", classId);
            request.addProperty("levelId", levelId);
            request.addProperty("schoolId", schoolId);
            request.addProperty("dateEnroled", dateEnroled);
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


    public String UpdatePupil(String pupilId, String pupilIdLocal, String firstName, String otherNames, String lastName, String sex, String dateOfBirthDay,
                              String dateOfBirthMonth, String dateOfBirthYear, String homeAddress,
                              String phoneNumber, String parentId, String classId, String levelId, String schoolId, String dateEnroled, String dateRegistered,
                              String dateLastUpdated , String uploaded)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdatePupil";
        String OPERATION_NAME_GetJsonData = "UpdatePupil";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/PupilServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilId", pupilId);
            request.addProperty("pupilIdLocal", pupilIdLocal);
            request.addProperty("firstName", firstName);
            request.addProperty("otherNames", otherNames);
            request.addProperty("lastName", lastName);
            request.addProperty("sex", sex);
            request.addProperty("dateOfBirthDay", dateOfBirthDay);
            request.addProperty("dateOfBirthMonth", dateOfBirthMonth);
            request.addProperty("dateOfBirthYear", dateOfBirthYear);
            request.addProperty("homeAddress", homeAddress);
            request.addProperty("phoneNumber", phoneNumber);
            request.addProperty("parentId", parentId);
            request.addProperty("classId", classId);
            request.addProperty("levelId", levelId);
            request.addProperty("schoolId", schoolId);
            request.addProperty("dateEnroled", dateEnroled);
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
