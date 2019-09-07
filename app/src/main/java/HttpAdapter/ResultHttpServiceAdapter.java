package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class ResultHttpServiceAdapter {


    public ArrayList<JSONObject> GetAllResults()
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllResults";
        String OPERATION_NAME_GetJsonData = "GetAllResults";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";


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



    public JSONObject GetResultById(String resultId)
    {
//        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetUserByUserNameAndPassword";
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetResultById";
        String OPERATION_NAME_GetJsonData = "GetResultById";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";
        SoapPrimitive response = null;

        JSONObject jsonObj = new JSONObject();

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("resultId", resultId);
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






    public ArrayList<JSONObject> GetResultByPupilIdAndSchoolId(String pupilId, String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetResultByPupilIdAndSchoolId";
        String OPERATION_NAME_GetJsonData = "GetResultByPupilIdAndSchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";

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




    public ArrayList<JSONObject> GetResultByPupilIdSchoolIdTermIdSessionId(String pupilId, String schoolId, String termId, String sessionId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetResultByPupilIdSchoolIdTermIdSessionId";
        String OPERATION_NAME_GetJsonData = "GetResultByPupilIdSchoolIdTermIdSessionId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";

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



    public ArrayList<JSONObject> GetResultByPupilIdSchoolIdTermIdSessionIdAndSubjectId(String pupilId, String schoolId, String termId, String sessionId, String subjectId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetResultByPupilIdSchoolIdTermIdSessionIdAndSubjectId";
        String OPERATION_NAME_GetJsonData = "GetResultByPupilIdSchoolIdTermIdSessionIdAndSubjectId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";

        SoapPrimitive response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilId", pupilId);
            request.addProperty("schoolId", schoolId);
            request.addProperty("termId", termId);
            request.addProperty("sessionId", sessionId);
            request.addProperty("subjectId", subjectId);
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



    public ArrayList<JSONObject> GetResultByPupilIdSchoolIdTermIdSessionIdSubjectIdExamIdAndLevelId(String pupilId, String schoolId, String termId, String sessionId, String subjectId, String examId, String levelId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetResultByPupilIdSchoolIdTermIdSessionIdSubjectIdExamIdAndLevelId";
        String OPERATION_NAME_GetJsonData = "GetResultByPupilIdSchoolIdTermIdSessionIdSubjectIdExamIdAndLevelId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";

        SoapPrimitive response=null;

        ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("pupilId", pupilId);
            request.addProperty("schoolId", schoolId);
            request.addProperty("termId", termId);
            request.addProperty("sessionId", sessionId);
            request.addProperty("subjectId", subjectId);
            request.addProperty("examId", examId);
            request.addProperty("levelId", levelId);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
            httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

            response = (SoapPrimitive) envelope.getResponse();




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

        }
        catch (Exception exception)
        {
            obj = null;
            exception.printStackTrace();
            //Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
        }

        return obj;

    }


    public ArrayList<JSONObject> GetResultBySchoolId(String schoolId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetResultBySchoolId";
        String OPERATION_NAME_GetJsonData = "GetResultBySchoolId";


        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";

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


    public String AddResult ( String resultIdLocal, String pupilId, String examId, String subjectId, String score,
                              String gradeId, String datePublished, String publishedBy, String approved,
                              String schoolId, String termId, String sessionId, String uploaded, String teacherRemarks, String levelId)
    {
        String responseString = "0";

        String SOAP_ACTION_GetJsonData ="http://tempuri.org/AddResult";
        String OPERATION_NAME_GetJsonData = "AddResult";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";



        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CareMobileAuthentication.asmx";
        SoapPrimitive response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("resultIdLocal", resultIdLocal);
            request.addProperty("pupilId", pupilId);
            request.addProperty("examId", examId);
            request.addProperty("subjectId", subjectId);
            request.addProperty("score", score);
            request.addProperty("gradeId", gradeId );
            request.addProperty("datePublished", datePublished );
            request.addProperty("publishedBy", publishedBy );
            request.addProperty("approved", approved );
            request.addProperty("schoolId", schoolId );
            request.addProperty("termId", termId );
            request.addProperty("sessionId", sessionId );
            request.addProperty("uploaded", uploaded );
            request.addProperty("teacherRemarks", teacherRemarks);
            request.addProperty("levelId", levelId);




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

        if(response != null){
              responseString = response.toString();
        }


        return responseString;

    }


    public String UpdateResult (String resultId, String resultIdLocal, String pupilId, String examId, String subjectId, String score,
                              String gradeId, String datePublished, String publishedBy, String approved,
                              String schoolId, String termId, String sessionId, String uploaded, String teacherRemarks, String levelId)
    {
        String SOAP_ACTION_GetJsonData ="http://tempuri.org/UpdateResult";
        String OPERATION_NAME_GetJsonData = "UpdateResult";

        String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";

        String SOAP_ADDRESS ="http://junior.landoria.org/WebServices/ResultServices.asmx";
//		  String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/UserServices.asmx";
        // String SOAP_ADDRESS = "http://localhost:49747/CasreMobileAuthentication.asmx";
        Object response=null;
        try
        {
            SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
            request.addProperty("resultId", resultId );
            request.addProperty("resultIdLocal", resultIdLocal);
            request.addProperty("pupilId", pupilId);
            request.addProperty("examId", examId);
            request.addProperty("subjectId", subjectId);
            request.addProperty("score", score);
            request.addProperty("gradeId", gradeId );
            request.addProperty("datePublished", datePublished );
            request.addProperty("publishedBy", publishedBy );
            request.addProperty("approved", approved );
            request.addProperty("schoolId", schoolId );
            request.addProperty("termId", termId );
            request.addProperty("sessionId", sessionId );
            request.addProperty("uploaded", uploaded );
            request.addProperty("teacherRemarks", teacherRemarks);
            request.addProperty("levelId", levelId);


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
