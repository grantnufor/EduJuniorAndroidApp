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
 * Created by Chisom on 5/23/2018.
 */

public class TeacherHttpServiceAdapter {

    public ArrayList<JSONObject> GetAllTeachers()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllTeachers";
        String OPERATION_NAME_GetJsonData = "GetAllTeachers";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/TeacherServices.asmx";


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


    public ArrayList<JSONObject> GetTeacherBySchoolId(String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetTeacherBySchoolId";
        String OPERATION_NAME_GetJsonData = "GetTeacherBySchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/TeacherServices.asmx";


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


    public JSONObject GetTeacherByEmailAddressAndPassword(String emailAddress, String password)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetTeacherByEmailAddressAndPassword";
        String OPERATION_NAME_GetJsonData = "GetTeacherByEmailAddressAndPassword";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/TeacherServices.asmx";
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



    public JSONObject GetTeacherByEmailAddress(String emailAddress)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetTeacherByEmailAddress";
        String OPERATION_NAME_GetJsonData = "GetTeacherByEmailAddress";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/TeacherServices.asmx";
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



    public String GetTeacherById(String teacherId)
    {

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetTeacherById";
        String OPERATION_NAME_GetJsonData = "GetTeacherById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/TeacherServices.asmx";
        SoapPrimitive response=null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("teacherId", teacherId);
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







    public String AddTeacher(String title, String firstName, String otherNames, String lastName, String homeAddress, String phoneNumber,
                             String emailAddress, String password, String dateOfBirth, String sex, String dateOfAppointment, String certificate,
                             String designation, String dateRegistered, String dateLastUpdated)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddTeacher";
        String OPERATION_NAME_GetJsonData = "AddTeacher";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";



        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/TeacherServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        SoapPrimitive response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("title", title);
            request.addProperty("firstName", firstName);
            request.addProperty("otherNames", otherNames);
            request.addProperty("lastName", lastName);
            request.addProperty("homeAddress", homeAddress);
            request.addProperty("phoneNumber", phoneNumber);
            request.addProperty("emailAddress", emailAddress);
            request.addProperty("password", password);
            request.addProperty("dateOfBirth", dateOfBirth);
            request.addProperty("sex", sex);
            request.addProperty("dateOfAppointment", dateOfAppointment);
            request.addProperty("certificate", certificate);
            request.addProperty("designation", designation);
            request.addProperty("dateRegistered", dateRegistered);
            request.addProperty("dateLastUpdated", dateLastUpdated);



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


    public String UpdateTeacher(String teacherId, String title, String firstName, String otherNames, String lastName, String homeAddress, String phoneNumber,
                                String emailAddress, String password, String dateOfBirth, String sex, String dateOfAppointment, String certificate,
                                String designation, String dateRegistered, String dateLastUpdated )
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateTeacher";
        String OPERATION_NAME_GetJsonData = "UpdateTeacher";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/TeacherServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("teacherId", teacherId);
            request.addProperty("title", title);
            request.addProperty("firstName", firstName);
            request.addProperty("otherNames", otherNames);
            request.addProperty("lastName", lastName);
            request.addProperty("homeAddress", homeAddress);
            request.addProperty("phoneNumber", phoneNumber);
            request.addProperty("emailAddress", emailAddress);
            request.addProperty("password", password);
            request.addProperty("dateOfBirth", dateOfBirth);
            request.addProperty("sex", sex);
            request.addProperty("dateOfAppointment", dateOfAppointment);
            request.addProperty("certificate", certificate);
            request.addProperty("designation", designation);
            request.addProperty("dateRegistered", dateRegistered);
            request.addProperty("dateLastUpdated", dateLastUpdated);


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