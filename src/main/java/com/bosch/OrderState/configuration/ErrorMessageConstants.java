/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.configuration;

public class ErrorMessageConstants {

    public static final String CONFLICT = "MSS Already Available Expection: ";

    public static final String E00001 = "Product name is already present for given categoryId and User.";
    public static final String E00002 = "Category is not found for given categoryId.";
    public static final String E00003 = "Business Categories not found for given Business Category Id.";
    public static final String E00004 = "Product is not found for given Product Id.";
    public static final String E00005 = "Bad Request.";
    public static final String E00006 = "error while parsing";
    public static final String E00007 = "categoryId key mandatory";
    public static final String E00008 = "productId not found";
    public static final String E00009 = "Exception while saving data in MongoDb";
    public static final String E000010 = "Error while object mapping";
    public static final String E000011 = "API Type is not found";
    public static final String E000013 = "Error while creating Collection";
    public static final String E000021 = "Error while saving product data";
    public static final String E000022 = "Given product is not available for given category";
    public static final String E000023 = "Product is already present.";
    public static final String E000024 = "Given authentication type is not valid.";
    public static final String E000025 = "Exception while updating data in MongoDb";
    public static final String E000026 = "Product is not found for the given product id";
    public static final String E000027 = "Error in merging the JSON.";
    public static final String E000028 = "No Groups found for this Product.";
    public static final String E000029 = " Invalid group name.";
    public static final String E000030 = "Endpoint name already exists.";
    public static final String E000031 = "Method invalid.";
    public static final String E000032 = "Error while Object Mapping.";
    public static final String E000033 = "Maximum file upload limit for product reached.";
    public static final String E000034 = " is already present";
    public static final String E000035 = "Duplicate Multipart files found";
    public static final String E000036 = "Maximum file upload size exceeded";
    public static final String E000037 = "Grant type is not found for given authentication Type.";
    public static final String E000038 = "State is not valid";
    public static final String E000039 = "Product already in same state";
    public static final String E000040 = "Error while saving Product Process data";
    public static final String E000041 = " cannot proceed to next state ";
    public static final String E000042 = "Comments should be required.";
    public static final String E000043 = "No workflows defined for Category.";
    public static final String E000044 = "No workflows defined for given version.";
    public static final String E000045 = "Error while XML Mapping";
    public static final String E000046 = "Product cannot be moved to same state: ";
    public static final String E000047 = "None of the attributes are editable in given state. ";
    public static final String E000048 = " : attributes are not editable in given state. ";
    public static final String E000049 = "Error while Json merge";
    public static final String E000050 = "Error while reading json patch";
    public static final String E000051 = "No review comments found for the Product Id.";
    public static final String E000052 = "State is not found";
    public static final String E000053 = "Error while updating product";
    public static final String E000054 = "JSONPatch error.";
    public static final String E000055 = "Error while merging the JSONs";
    public static final String E000056 = "Exception with elastic search.";
    public static final String E000057 = "No data is available to update";
    public static final String E000058 = "Group Name already exists";
    public static final String E000059 = "Request contains duplicate endpoint names";
    public static final String E000060 = "SecretHeader Name already exists";
    public static final String E000061 = "SecretParamter Name already exists";
    public static final String E000062 = "Name already exists.";
    public static final String E000063 = "Name or _Id is missing.";
    public static final String E000064 = "Duplicate business categories are present in request";
    public static final String E000065 = "Comment not present for given user Id";
    public static final String E000066 = "Comment cannot be edited";
    public static final String E000067 = "This Comment is not yet approved by the admin.";
    public static final String E000068 = "Not Authorized";
    public static final String E000069 = "text field mandatory";
    public static final String E000070 = "Approval value or reject comments is required.";
    public static final String E000071 = "Review comments is not found.";
    public static final String E000072 = "Review comment is required and Maximum allowed length is 500.";
    public static final String E000073 = "Reply comment is required and maximum length is 500";
    public static final String E000074 = "Rating cannot updated here";
    public static final String E000075 = "Rating Id is mandatory";
    public static final String E000076 = "Product seller can only reply";
    public static final String E000077 = "Rating is not found for given product Id";
    public static final String E000078 = "Comment Id is not found for given user and product";
    public static final String E000079 = "Products are not found for given userId.";
    public static final String E000080 = "Duplicate Files are presents in request.";
    public static final String E000081 = " files are not found.";
    public static final String E000082 = "Approval status cannot be changed.";


    // Rating Error messages
    public static final String E000083 = "Rating Factor is not applicable for the given ratingFactorId and categoryId";
    public static final String E000084 = "Invalid ratingValue given. Not in applicable range";
    public static final String E000085 = "Invalid Input. Rating {uid} should be Null or Empty for CREATE mode";
    public static final String E000086 = "Invalid Input. Rating {uid} should not be Null or Empty for UPDATE mode";
    public static final String E000087 = "Product Rating not found for the given rating uid and userId";
    public static final String E000088 = "Product document not found for the given productId in elastic search cache. Product average rating cannot be updated in Elastic search cache";
    public static final String E000089 = "Error while trying to fetch average rating for the given product id and rating factor id";
    public static final String E000090 = "Product Rating already present for the given productId, ratingFactorId and userId";
    public static final String E000091 = "Rating factorId cannot be NULL or Empty";
    public static final String E000092 = "ratingValue cannot be NULL";
    public static final String E000093 = "Product not yet PUBLISHED. Only products in PUBLISHED state can be rated";
    public static final String E000094 = "userId cannot be Null or Empty for Product Rating";
    public static final String E000095 = "categoryId cannot be Null or Empty for Product Rating";
    public static final String E000096 = "Rating Factor is not available for the given ratingFactorId";
    public static final String E000097 = "You donot have sufficient previleges to edit this product.";
    public static final String E000098 = "You donot have sufficient previleges to perform this state change.";
    public static final String E000099 = "BaseUrl is already present.";
    public static final String E000100 = "Rating is mandatory.";
    public static final String E000110 = "Value not matching the datatype of Header or Parameter or Path variables";
    public static final String E000111 = "Not a valid datatype selected for Header or Parameter or Path variables";
    public static final String E000112 = "Name, Datatype, Value and isRequired are mandatory for Header and Parameter or Path variables";
    public static final String E000113 = "Error While Saving the Product Doc in Azure Blob";
    public static final String E000114 = "Error While uploading the file to Azure Blob, Blob Url not generated";
    public static final String E000115 = "Invalid Document Id";
    public static final String E000116 = "No Matching Document Found";

    // Costing model error messages
    public static final String E000117 = "Default Admin plans are not found";
    public static final String E000118 = "Invalid currency id - ";
    public static final String E000119 = "Invalid billingCycleId - ";
    public static final String E000120 = "Invalid rateLimitTypeId - ";
    public static final String E000121 = "Invalid bandWidthUnitId - ";
    public static final String E000122 = "Invalid timeUnitId - ";
    public static final String E000123 = "bandWidthUnitType not applicable for Rate Limit Type - ";
    public static final String E000125 = "apiPlan not found for the given productId and planId";
    public static final String E000126 = "Plan Name is already present";
    public static final String E000127 = "rateLimit.RateLimitType and softLimitData.RateLimitType should be same";
    public static final String E000128 = "softLimitData is mandatory if isSoftLimit is set as {true} or if apiPlanBillingCycle is set as {Pay Per Use}";
    public static final String E000129 = "Minimum one plan is required for a product. Requested plan cannot be deleted";
    public static final String E000130 = "bandWidthUnitType is mandatory for Rate Limit Type - ";
    public static final String E000131 = "burstControlLimit.limitCount should be less than rateLimit.limitCount";
    public static final String E000140 = " file is empty. Cannot upload the empty file.";
    public static final String NULLOREMPTY = " cannot be null or empty";
    public static final String POSITIVE_VALUE = " must be positive value";
    public static final String STRING_MAX_LIMIT = " must be less than or equal to {max} characters";
    public static final String VALUE_OUT_OF_BOUNDS = " value out of bounds.Expected value format [{integer} digits.{fraction} digits]";
    public static final String E000145 = "Maximum apiPlan limit reached for product. Maximum apiPlan limit - ";
    public static final String E000146 = "apiPlanName supports only AlpaNumeric and UPPERCASE characters";
    public static final String E000142 = "requested Product not found for the User";
    public static final String E000143 = "timeUnitType master data does not exist for - ";
    public static final String E000144 = "Atleast one apiPlan should be enabled for the product";
    public static final String E000147 = "Atleast one apiPlan should be present for the product";
    public static final String E000148 = "rateLimit cannot be null or Empty";
    public static final String E000132 = "Path parameter should present and unique in relative path";
    public static final String E000133 = "Relative path should not null.";
    public static final String E000134 = "Path Parameter data should be availale.";
    public static final String E000353 = "Product Base Id or Variant Id cannot be Null or Empty";
    public static final String E000354 = "Exception: Duplicate Plan Ids";
    public static final String E000386 = "Maximum 30 Characters Allowed";
    public static final String E000387 = "Maximum Four Plan Benefits Allowed";
    public static final String E000388 = "Minimum One Plan Benefits Required";
    public static final String E000389 = "Minimum One Character Required";

    // user management error messages
    public static final String E000135 = "User details not found in Security Context. User Roles cannot be fetched";
    public static final String E000136 = "Invalid User role. User does not have required access to change product state - ";
    public static final String E000137 = "Rating id is not found for given comment";
    public static final String E000138 = "Product id or product name is not updatable for given comment";
    public static final String E000139 = "Duplicate Name in Request of Path Parameter, Header or Parameters";
    public static final String E000141 = "Duplicate Id in Request of Path Parameter, Header or Parameters";
    public static final String E000150 = "Error while getting authetication token from gateway";
    public static final String E000151 = "Error while migrating to Gateway.";
    public static final String E000152 = "Error while publishing the Gateway migrated API.";
    public static final String E000153 = "Error in transforming data to requested format.";
    public static final String E000154 = "Error in adding message mediation.";
    public static final String E000155 = "Error while migrating the subscription policies.";
    public static final String E000156 = "Product is being rated by Same seller.";
    public static final String E000157 = "Admin has already approved this review comment.";
    public static final String E000158 = "BaseUrl is not present for this API product, can not update API Authorization Key";
    public static final String E000159 = "Authorization key is already present.";
    public static final String E000160 = "Not a valid file or file format.";
    public static final String E000161 = "Error while parsing swagger.";
    public static final String E000162 = "Not a valid base url.";
    public static final String E000163 = "Http method not supported exception.";
    public static final String E000164 = "No Business Categories Mapped.";
    public static final String E000165 = "Error in fetching Analytics data.";
    public static final String E000166 = "Begin date/time cannot be greater than current date/time.";
    public static final String E000167 = "Begin date/time cannot be greater than or equal to End date/time.";
    public static final String E000168 = "Begin date/time cannot be greater than 1 year.";
    public static final String E000169 = "authType is missing in authentication details.";
    public static final String E000170 = "Not a proper date format.";
    public static final String E000171 = "Reject reason can not be set for non Reject state.";
    public static final String E000172 = "No reject reasons mapped for given product category id.";
    public static final String E000173 = "Invalid reject reason id";
    public static final String E000174 = "Error while demoting the status for Create call in gateway";

    // subscription error messages
    public static final String E000175 = "Error while migrating developer application during Application creation";
    public static final String E000176 = "Error while generating developer application keys";
    public static final String E000177 = "Duplicate application name exception. Application already present for the user";
    public static final String E000178 = "Subscription cannot be created due to user application not migarted";
    public static final String E000179 = "Subscription cannot be created due to Api Plan not migarted";
    public static final String E000180 = "Error while creating subscription for apiPlan";
    public static final String E000181 = "Application not found for the user and applicationId";
    public static final String E000182 = "Invalid Application id";
    public static final String E000183 = "Error while generating application token for user application";
    public static final String E000184 = "User already has an active subscription for the given productId";
    public static final String E000185 = "Token cannot be generated. Atleast one active subscription shoud be present for the user";
    public static final String E000186 = "Token cannot be generated due to application Still not migrated";
    public static final String E000187 = "Active subscription not found for the given api subscriptionId";
    public static final String E000188 = "Error while deleting api Plan during subscription";
    public static final String E000189 = "Error while deleting Mediation policies.";
    public static final String E000190 = "Invalid role specified.";
    public static final String E000191 = "apiPlan cannot be disabled or deleted. apiPlan has atleast one active subscription.";
    public static final String E000192 = "Invalid document type id";
    public static final String E000193 = "Required config key for file upload is not configured.";
    public static final String E000194 = "Invalid Data type for config value.";
    public static final String E000195 = "File size is more than allowed file size.";
    public static final String E000196 = "Method is required in Request";
    public static final String E000197 = "Endpoint name is required in Request";
    public static final String E000198 = "clientAuthentication is missing in authentication details.";
    public static final String E000199 = "Invalid clientAuthentication type provided in authentication details.";
    public static final String E000200 = "Multiple form data parameters are not supported.";
    public static final String E000201 = "Mulitple body parameter are not supported.";
    public static final String E000202 = "Please select relevant Content type.";
    public static final String E000203 = "Datatype not supported for the parameter type.";
    public static final String E000204 = "Body parameter type not supported for Method type.";

    // costing model migration error messages
    public static final String E000205 = "Api Plan cannot be updated/deleted";
    public static final String E000206 = "Error while updating subscription throttling policy";
    public static final String E000207 = "Api details not found for the given productId in throttle policy";
    public static final String E000208 = "Error while fetching API details from gateway";
    public static final String E000209 = "Error while mapping subscription throttling policy into Api";
    public static final String E000210 = "Error while deleting subscription throttling policy in gateway";
    public static final String E000211 = "Error while creating subscription throttling policy JSON object";

    // end point detail validations
    public static final String E000212 = "No end points found for the product to delete";
    public static final String E000213 = "Requested end point id doesnt exist in DB";
    public static final String E000214 = "requested end point doesnt have _id";
    public static final String E000215 = "Request contains duplicate relative paths";
    public static final String E000216 = "Endpoint relative path already exists.";
    public static final String E000217 = "application name supports only AlpaNumeric, '_', '-' characters";
    public static final String E000218 = "application is having active Subscription(s). Application cannot be deleted";
    public static final String E000219 = "Minimum one application should be present. Requested application cannot be deleted";
    public static final String E000220 = "Consumer Application cannot be deleted due to Migration failure";
    public static final String E000221 = "Error while deleting application due to token error";

    // Email Template detail validations
    public static final String E000225 = "Invalid Email Template selected.";
    public static final String E000222 = "Some error occured in email template.";
    public static final String E000223 = "ProductId is required.";
    public static final String E000224 = "No EmailIds found for the users.";
    public static final String E000228 = "Product is not found for given Product Id with published state.";
    public static final String E000235 = "Maximum allowed length is 1000 for Comments.";
    public static final String E000236 = "Product cannot be deleted in Published and consumed state.";
    public static final String E000237 = "Exception while deleting data in MongoDb";
    public static final String E000238 = "Exception in deleting the product.";
    public static final String E000240 = "Applications not found for the user.";
    public static final String E000241 = "No Data Available!";

    // Throttle policy error messages
    public static final String E000242 = "Invalid throttleTypeId - ";
    public static final String E000243 = "Throttle policy name supports only AlpaNumeric, '_', '-' characters";
    public static final String E000244 = "Invalid {paramName} for IP condition";
    public static final String E000245 = "IP Address cannot be NULL or Empty";
    public static final String E000246 = "Invalid IP Address - ";
    public static final String E000247 = "Invalid IP Address range";
    public static final String E000248 = "Duplicate throttle policy name exception.Throttle policy already present for the user";
    public static final String E000249 = "Invalid user";
    public static final String E000251 = "Your details are not found, please sign up and register.";
    public static final String E000250 = "Error while migrating security throttle policy";
    public static final String E000252 = "Error while updating security throttle policy";
    public static final String E000253 = "Security throttle policy not migrated";
    public static final String E000254 = "Invalid throttle condition type ";
    public static final String E000255 = "Invalid condition group id";
    public static final String E000256 = "Duplicate conditionGrpName exception.conditionGrpName already present for the throttle policy";
    public static final String E000257 = "Duplicate throttle condition exception - ";
    public static final String E000258 = "APIs associated with the Throttle policy are consumed.Throttle policy and conditions cannot be modified";
    public static final String E000259 = "Invalid list of productIds";
    public static final String E000260 = "User does not have any products to map";
    public static final String E000261 = "- producId  is already having throttle policy assigned";
    public static final String E000262 = "Error while mapping advanced throttling policy";
    public static final String E000263 = "One or more product id in the given productIds list is not having throttle policy assigned. Cannot un-map the throttle policy";
    public static final String E000264 = "Throttle policy does not have any active Apis mapped";
    public static final String E000265 = "Error while un-mapping advanced throttling policy";
    public static final String E000266 = "Throttle conditionGrpName supports only AlpaNumeric, '_', '-' characters";
    public static final String E000267 = "Security throttle policy not found for the given throttle policy id and companyId";
    public static final String E000268 = "Product Api is already subscribed and consumed.Throttle policy cannot be mapped to productId - ";
    public static final String E000269 = "Throttle policy should have atleast one conditionGroup for mapping to product";
    public static final String E000270 = "atleast one condition should be active in a condition group";
    public static final String E000271 = "Users not found given emailId.";
    public static final String E000272 = "Private plan already assigned for the user.";
    public static final String E000273 = "Private plans cannot be assigned to both user and business group.";
    public static final String E000274 = "Business group not found.";
    public static final String E000275 = "Private plan already assigned for the group.";
    public static final String E000276 = "Error while fetching the policies.";
    public static final String E000277 = "Plan not available for the user.";
    public static final String E000278 = "User Id or Business group is required for Private plans.";
    public static final String E000283 = "{paramName} supports only AlpaNumeric, '_', '-' characters for HEADER,QUERY,JWT conditions";
    public static final String E000284 = "Invalid regex input for {paramName} - ";

    // costing model error messages
    public static final String E000279 = "PAY_PER_CALL is applicable only for unlimited plan";
    public static final String E000280 = "only PAY_PER_CALL billing cycle is applicable for unlimited plan";
    public static final String E000281 = "User specific Private plan not found to update.";
    public static final String E000282 = "Group specific Private plan not found to update.";
    public static final String E000285 = "Multiple content types not supported.";
    public static final String E000286 = "Duplicate name exception";
    public static final String E000287 = "Error while updating authorization key secret header";
    public static final String E000288 = "Invalid user request";
    public static final String E000289 = "Error while submitting user request";
    public static final String E000290 = "Tryout plan already exists for the product";
    public static final String E000291 = "Subscribe to the API to tryout API";
    public static final String E000292 = "Tryout validity has been expired";
    public static final String E000293 = "Invalid URL: ";
    public static final String E000294 = "URL already present: ";
    public static final String E000295 = "URL does not exist: ";
    public static final String E000296 = "Invalid API Metric:";
    public static final String E000297 = "Cannot subscribe for your own product.";
    public static final String E000298 = "API Metric not applicable:";
    public static final String E000299 = "Invalid Date";
    public static final String E000230 = "Error generating Swagger file.";
    public static final String E000301 = "Swagger documentation not found.";
    public static final String E000302 = "Invalid application id or api id";
    public static final String E000303 = "Error fetching results from database";
    public static final String E000304 = "Only one API can be selected at a time";
    public static final String E000305 = "Invalid API";
    public static final String E000340 = "API Name not available";
    public static final String E000341 = "AuthType not available";
    public static final String E000342 = "Invalid AuthType";
    public static final String E000343 = "OAuth2 authentication details not available";
    public static final String E000344 = "MSS Secret key not available";
    public static final String E000345 = "API Description not available";
    public static final String E000346 = "EndpointDetails not available";
    public static final String E000347 = "Business Category not not available";
    public static final String E000348 = "Base URL not available";
    public static final String E000349 = "apiType not available";
    public static final String E000350 = "SKU Ids not available for given product and plan";
    public static final String E000351 = "Checkout Id Already Exists";
    public static final String E000352 = "Order Id Already Exists";
    public static final String E000355 = " product category, cannot have this pricing model.";
    public static final String E000356 = "Pre Checkout Call Is Not completed";
    public static final String E000357 = "Service Auth Header Invalid for Subscrition after Order Contract Mapping";
    public static final String E000370 = "Maximum model length exceeded";
    public static final String E000358 = "Invalid Prcing preference";
    public static final String E000359 = "Order Is Already Placed";
    public static final String E000384 = "Special characters not allowed";

    //Audit Loggin error messages
    public static final String E000360 = "SubModule is not found";
    public static final String E000361 = "SubModule is not enabled";

    public static final String E000362 = "Please provide request body";
    public static final String E000015 = "Error while encrypting data";
    public static final String E000016 = "Error while decrypting data";
    public static final String E000019 = "Error while creating  Secretkey";
    public static final String E000020 = "No property was found for name";
    public static final String E000363 = "No cookie found";
    public static final String E000364 = "Number of tiers should be greater than one and less than or equal to ten";
    public static final String E000365 = "Invalid data in tiers";
    public static final String E000366 = "Slab limit details cannot be Null or Empty";
    public static final String INTEGER_VALUE = "should be an Integer value";
    public static final String POSITIVE_INTEGER_VALUE = "should be an Positive Integer value";
    public static final String DECIMAL_VALUE = "should be an Decimal value";
    public static final String E000368 = "Custom plan name can not be default plan names like BASIC and GOLD";
    public static final String E000369 = "Error while processing escape characters";
    public static final String E000373 = "Invalid time frame";
    public static final String E000374 = "From Date and To Date can not be equal";
    public static final String E000375 = "Error while validating time frame";

    //Cannot be empty error message
    public static final String E000367 = " cannot be empty";

    // Tryout
    public static final String E000371 = "No data available";
    public static final String E000372 = "Exception while fetching tryout data";
    public static final String E000376 = "Product  can not be subscribed since it is not in published state";

    public static final String E000380 = "Reason for unsubscribe is mandatory.";
    public static final String E000381 = "Reason comment for unsubscribe is mandatory.";
    public static final String E000382 = "Invalid reason selected.";
    public static final String E000383 = "This order cant be unsubcribed since this subcription is for tryOut ";
    public static final String E000390 = "Requested Product not editable by this company";

    public static final String E000385 = "Error in dcs checkout api";
    public static final String E000391 = "Error While Posting Consumption Details";

    public static final String E000398 = "Error While Posting Consumption Details";

    //Proposal error message
    public static final String E000392 = "Given proposal status not found";
    public static final String E000393 = "Error while saving proposal";
    public static final String E000394 = "Proposal not found in MSS";
    public static final String E000395 = "Error occured while fetching proposal";
    public static final String E000396 = "Proposal already available with MSS";
    public static final String E000397 = "cannot be empty";
    public static final String E000399 = "Error while saving proposal history details";
    public static final String E000400 = "Error while updating proposal details";
    public static final String E000401 = "Product name edit is not allowed if the API is published at least once";
    public static final String E000411 = "Plan Id cannot be Null or Empty";
    public static final String E000412 = "SKU Id is mandatory for Plan.";
    public static final String E000413 = "Product is not in submitted state.";
    public static final String E000402 = "The action can't be completed because the tryout plan has been enabled by the buyer";


    public static final String E000403 = "Error while accepting a proposal";
    public static final String E000404 = "Error while rejecting a proposal";
    public static final String E000405 = "Given Proposal is already in Rejected status";
    public static final String E000406 = " maximum product highlights supported";
    public static final String E000407 = "Atleast 1 highlight should be added";
    public static final String E000408 = "Error while posting event to azure";
    public static final String E000409 = "Reject reason is empty";
    public static final String E000410 = "Status not matched";
    public static final String E000414 = "The given company id is not found";
    public static final String E000415 = "Error while getting company details";
    public static final String E000416 = "Billing Type is mandatory";
    public static final String E000417 = "One time payment can not contains slablimit details";
    public static final String E000418 = "InValid BillingTypeId";
    public static final String E000419 = "InValid ChargeableUnitId";


    public static final String E000420 = " maximum product FAQ supported";
    public static final String E000421 = "Atleast 1 FAQ should be added";
    public static final String E000422 = "Atleast 1 tag should be added";
    public static final String E000423 = " maximum product Tags supported";

    public static final String E000424 = "ConsumerAppId is Mandatory for API product";
    public static final String E000425 = "Application Id is not available";
    public static final String E000426 = "Subscription not found";
    public static final String E000427 = "Already Default plan exist for this product";
    public static final String E000428 = "The Order has been already placed";
    public static final String E000429 = "Given SKUID not found";
    public static final String E000430 = "Unable to delete product, since its already approved once";
    public static final String E000431 = "User doesn't have access to enter more than 100 characters";
    public static final String E000432 = "Invalid data has been entered";
    public static final String E000433 = "Invalid provider has been entered";
    public static final String E000434 = "sum of bosch and seller share should not more than 100";
    public static final String E000435 = "Company Id mismatch";
    public static final String E000436 = "Invalid Requestor Found!";
    public static final String E000437 = "Product Category Id mismatch";
    public static final String E000438 = "Invalid skuBaseId";
    public static final String E000439 = "Invalid skuVariantId";
    public static final String E000440 = "Invalid BoschShare";
    public static final String E000441 = "Invalid SellerShare";

    public static final String E000442 = "Consumption data already available for the given contract between given dates";
    public static final String E000443 = "Error while saving consumption data";
    public static final String E000444 = "Error while saving pay by receipt data";
    public static final String E000445 = "End date should be greater than start date";
    public static final String E000446 = "Future Dates are not allowed";
    public static final String E000447 = "Date should be in yyyy-MM-dd HH:mm:ss format";
    public static final String E000448 = "Contract not found or contract is not in active state";
    public static final String E000449 = "For given contract id and Msorder id no subscription found";
    public static final String E000450 = "Duplicate contract id are available in payload ";

    public static final String E000451 = "MS OrderId not found";
    public static final String E000452 = "You are trying to post consumption data before the contract creation date and time";
    public static final String E000453 = "Order is not in completed status";
    public static final String E000460 = "SkuId is already present. Duplicate SkuId not permitted ";
    public static final String E000461 = "Duplicate SkuId is not permitted. ";

    public static final String E000106 = "Error while authentication of ERP system";
    public static final String E000107 = "Error : System Authentication is Off and ERP system Token is not sent";
    public static final String E000457 = "Company is not registered";

    public static final String E000454 = "Duplicate SKU id are available in payload";
    public static final String E000455 = "Unauthorized to view this Proposal";
    public static final String E000456 = "The pricing plan is not found in view.";
    public static final String E000458 = "TimeUnit is not allowed for Rate Limit Type - ";
    public static final String E000459 = "Chargeable Unit is not allowed for Rate Limit Type - ";
    public static final String E000463 = "Error while migrating consumerApplicationId";
    public static final String E000464 = "SKU ID is invalid";
    public static final String E000465 = "Given contract id is not found";
    public static final String E000466 = "service start date cannot predated since the given date is before the contrat creation date";
    public static final String E000467 = "Meta Data not found for given Product Id";
    public static final String E000468 = "Meta Data already present for given Product Id";
    public static final String E000469 = "Product Id cannot be null or empty";

    private ErrorMessageConstants() {
    }
}
