/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.constants;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author AVN9KOR
 */
public class ApplicationMessageConstants {
    public static final List<String> FILE_UPLOAD_CONFIG_KEYS = new ArrayList<>();

    // Product Categories
    public static final String API_PRODUCT_TYPE = "API";
    public static final String FEATURE_PRODUCT_TYPE = "Feature";
    public static final String CLOUD_INFRA_PRODUCT = "Cloud Infrastructure";
    public static final String DATA_PRODUCT = "Data";
    public static final String SOLUTION_PRODUCT = "Solutions";


    // Supported product categories should be loaded from DB or from Master cache
    public static final Set<String> SUPPORTED_PRODUCT_CATEGORIES = new HashSet<>();

    static {
        SUPPORTED_PRODUCT_CATEGORIES.add(API_PRODUCT_TYPE);
        SUPPORTED_PRODUCT_CATEGORIES.add(FEATURE_PRODUCT_TYPE);
        SUPPORTED_PRODUCT_CATEGORIES.add(CLOUD_INFRA_PRODUCT);
        SUPPORTED_PRODUCT_CATEGORIES.add(DATA_PRODUCT);
    }

    // Boolean values
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String WHITE_SPACE = " ";
    public static final String AUTO_GENERATED_ID_FIELD = "_id";
    public static final String URI_PATH_SEPARATOR = "/";
    public static final String UNDERSCORE = "_";
    public static final String SERVICE_AUTH = "PJMS-ORDER_CONTRACT_MAP_AUTH";

    // attributes
    public static final String PRODUCT_DETAIL_INFO = "productDetailedInfo";
    public static final String PROD_BASIC_INFO = "prodBasicInfo";
    public static final String STATE_CHANGE_ON_EDIT = "stateChangeOnEdit";
    public static final String PRODUCT_ID = "productId";
    public static final String OTHER = "Other";
    public static final String VALIDATE = "validate";
    public static final String CATEGORY_ID = "categoryId";
    public static final String REVIEW_ID = "reviewId";
    public static final String PRODUCT_CATEGORY_MAP = "productCategoryMap";
    public static final String PRODUCT_CATEGORY = "productCategory";
    public static final String BASE_URL = "baseUrl";
    public static final String ACCESS_CONTROL = "accessControls";
    public static final String ACCESS_CONTROL_SECRET_HEADER = "accessControls.secretHeaders";
    public static final String ACCESS_CONTROL_SECRET_PARAM = "accessControls.secretParameter";
    public static final String API_TYPE = "apiType";
    public static final String AUTH_DETAILS = "authDetails";
    public static final String AUTH_TYPE = "authType";
    public static final String END_POINT_DETAILS = "endPointDetails";
    public static final String NAME = "name";
    public static final String METHOD = "method";
    public static final String GROUP = "group";
    public static final String END_POINT_GROUPS = "endpointGroups";
    public static final String GROUP_NAME = "groupName";
    public static final String GRANT_TYPE = "grantType";
    public static final String AUTHORIZATION_URL = "authorizationUrl";
    public static final String AUTHENTICATION_URL = "authenticationUrl";
    public static final String LEGS = "legs";
    public static final String CLIENT_AUTHENTICATION = "clientAuthentication";
    public static final String SEPARATOR = "separator";
    public static final String SCOPE = "scope";
    public static final String PRODUCT_DOCUMENTS_LIST = "productDocumentsList";
    public static final String FILE_MIME_TYPE = "mimeType";
    public static final String CANCELLED = "CANCELLED";
    public static final String ACTUAL_FILE_NAME = "actualFileName";
    public static final String UNIQUE_FILE_NAME = "uniqueFileName";
    public static final String FILE_CREATED_DATE = "TimeStamp";
    public static final String FILE_INPUT_STREAM = "fileInputStream";
    public static final String API_AUTH_KEY = "authorizationKey";
    public static final String SECRET_HEADER = "secretHeaders";
    public static final String SECRET_PARAMETER = "secretParameter";
    public static final String PARAMS_KEY_CASE = "parametersToReplaceCase";
    public static final String PARAMS_KEY_DEFAULT = "parametersToReplaceDefault";
    public static final String HEADERS_REPLACE_KEY = "headersToReplace";
    public static final String HEADER = "headers";
    public static final String PARAMETER = "parameters";
    public static final String PATH_PARAMETER = "pathParameter";
    public static final String DATATYPE = "datatype";
    public static final String ISREQUIRED = "isRequired";
    public static final String TRYOUT = "TRYOUT_APPLICATION";
    public static final String TRYOUT_APPLICATION = "Tryout application";
    public static final String THUMBNAIL_DOCUMENT_NAME = "Thumbnail image";
    public static final String MULTI_PART = "multipart";
    public static final String VIN = "VIN";
    public static final String COVERIMAGE_DOCUMENT_NAME = "Upload Cover Image";
    // path constants
    public static final String PATH_DETAILED_INFO = URI_PATH_SEPARATOR + PRODUCT_DETAIL_INFO;
    public static final String PATH_API_TYPE = PATH_DETAILED_INFO + URI_PATH_SEPARATOR + API_TYPE;
    public static final String PATH_ACCESS_CONTROLS = PATH_DETAILED_INFO + URI_PATH_SEPARATOR + ACCESS_CONTROL;
    public static final String PATH_AUTH_DETAILS = PATH_ACCESS_CONTROLS + URI_PATH_SEPARATOR + AUTH_DETAILS;
    public static final String PATH_AUTH_TYPE = PATH_AUTH_DETAILS + URI_PATH_SEPARATOR + AUTH_TYPE;
    public static final String PATH_GRANT_TYPE = PATH_AUTH_DETAILS + URI_PATH_SEPARATOR + GRANT_TYPE;

    // MongoDbOperation
    public static final String IN = "$in";
    public static final String AND = "$and";
    public static final String SET = "$set";
    public static final String UNSET = "$unset";
    public static final String PULL_ALL = "$pullAll";
    public static final String ADD_TO_SET = "$addToAll";
    public static final String PRODUCT_NAME = "productName";
    public static final String PRODUCT_SHORT_DESC = "productShortDesc";
    public static final String PRODUCT_LONG_DESC = "productLongDesc";
    public static final String PRODUCT_TERMS_AND_CONDITION = "termsAndConditions";
    public static final String PRODUCT_BUSINESS_CATEGORY_MAP = "productBusinessCategoryMap";
    public static final String BUSINESS_CATEGORY = "businessCategory";
    public static final String BUSINESS_CATEGORY_ID = "businessCategoryId";
    public static final String BUSINESS_CATEGORY_NAME = "businessCategoryName";

    // Multipart File constants
    public static final String DOCUMENT_COLLECTION = "Documents";
    public static final String MULTIPART_FILE_SUCCESS = "File Uploaded successfully";
    public static final String MULTIPART_FILE_DELETE_SUCCESS = "Files deleted successfully";

    // Multipart File constants
    public static final String COMMENTS = "comments";
    public static final String NULL = "null";
    public static final String CURRENT_WORKFLOW_VERSION = "1";
    public static final String COMMA = ",";
    public static final String OPERATION = "op";
    public static final String PATH = "path";
    public static final String VALUE = "value";
    public static final String REPLACE = "replace";
    public static final String ADD = "add";
    public static final String REMOVE = "remove";
    public static final String MOVE = "move";
    public static final String REJECT_MSG = "Review comment has been rejected.";
    public static final String APPROVE_MSG = "Review comment has been approved.";
    public static final int MAX_LENGTH = 1000;
    public static final String PERCENT = "%";
    public static final String PERCENT_REPLACE_WITH = "%25";

    // Master Configuration Keys
    public static final String ALLOWED_MIME_TYPES = "com.bosch.mss.fileUpload.supportedFileFormats";
    public static final String ALLOWED_FILE_EXTENSIONS = "com.bosch.mss.fileUpload.supportedFileExtensions";
    public static final String MAXIMUM_FILE_COUNT = "com.bosch.mss.fileupload.maxFileCount";
    public static final String MAXIMUM_FILE_SIZE = "com.bosch.mss.fileUpload.maxFileSizeInBytes";
    public static final String RATING_MIN_LIMIT = "Rating_min_limit";
    public static final String RATING_MAX_LIMIT = "Rating_max_limit";
    public static final String MAXIMUM_PLANS_COUNT = "Product_max_plans";
    public static final String MINIMUM_PLANS_COUNT = "Product_min_plans";

    // Entity Names
    public static final String PRODUCT_ENTITY = "Product";
    public static final String RATING_FACTOR_ENTITY = "RatingFactor";
    public static final String MSS_SYSTEM = "MSS_SYSTEM";

    // store procedures
    public static final String CALCULATE_AVG_RATING_SP = "SP_CALCULATE_AVG_RATING";
    public static final String ALL = "all";
    public static final String CATEGORY = "category";
    public static final String BUSINESSCATEGORY = "businesscategory";
    public static final String AUTHENTICATION = "authentication";
    public static final String APITYPE = "apitype";
    public static final String GRANTTYPE = "granttype";
    public static final String STATUS = "status";
    public static final String NAME_UNIQUENESS = "Product name is unique.";
    public static final String BASEURL_UNIQUENESS = "BaseUrl is unique.";
    public static final String API_METHOD = "apimethods";
    public static final String CURRENCY_TYPE = "currency";
    public static final String RATE_LIMIT_TIME_UNIT = "rate_limit_time_unit";
    public static final String BURST_TIME_UNIT = "burst_time_unit";
    public static final String RATE_LIMIT_TYPE = "rate_limit";
    public static final String BANDWIDTH_TYPE = "bandwidth";
    public static final String BILLING_CYCLE_TYPE = "billing_cycle";
    public static final String UPLOAD_FILE_TYPE = "upload_file_type";
    public static final String GRANTTYPE_FIELDS = "granttype_fields";
    public static final String USER = "UserRating";
    public static final String ALL_RATING = "AllRating";
    public static final String AVG_RATING = "AverageRating";
    public static final String RATE_LIMIT = "rateLimit.";
    public static final String SOFT_LIMIT = "softLimitData.";
    public static final String PATH_PARAM_REGEX = "\\{(.*?)\\}";
    public static final String UID = "uid";
    public static final String URL = "url";
    public static final String API_PLANNAME_REGEX = "^[-_,@#&*\\(\\)\\[\\]\\{\\}A-Z0-9\\s]*$";
    public static final String API_PLANDESC_REGEX = "/^[-_,@#&*\\(\\)\\[\\]\\{\\}A-Za-z0-9.\\s]*$/";
    public static final String TIME_MONTHLY = "MONTHLY";
    public static final String CREATE_MODE = "CREATE";
    public static final String UPDATE_MODE = "UPDATE";
    public static final String REQUEST_PER_HOUR = "REQUEST_PER_HOUR";
    public static final String REQUEST_PER_MIN = "REQUEST_PER_MIN";
    public static final String REQUEST_PER_SEC = "REQUEST_PER_SEC";
    public static final String BANDWIDTH_LIMIT = "DATA_BANDWIDTH";
    public static final String COUNT_LIMIT = "REQUEST_COUNT";
    public static final String DAILY = "DAILY";
    public static final String MONTHLY = "MONTHLY";
    public static final String LIMIT_GB = "GB";
    public static final String LIMIT_KB = "KB";
    public static final String LIMIT_MB = "MB";
    public static final String BODY_PARAMETER = "body";
    public static final String BODY_KEY = "Body";
    public static final String FORMDATA_PARAMETER = "formdata";
    public static final String FORMDATA_KEY = "FormData";
    public static final String FORM_URLENCODED_PARAMETER = "formurlEncoded";
    public static final String FORM_URLENCODED_KEY = "FormURLEncoded";
    public static final String CONTENT_TYPE = "content_type";
    public static final String PARAM_TYPE = "param_type";
    public static final String PARAM_DATATYPE = "param_datatype";
    public static final String PARAM_CONTENT_TYPE = "contentType";
    public static final String NOT_APPLICABLE = "Not Applicable";
    public static final String HEADER_KEY = "Header";
    public static final String PATH_KEY = "Path";
    public static final String QUERY_KEY = "Query";
    public static final String STRING_DATA_TYPE = "String";
    public static final String STRING = "String";
    public static final String NUMBER = "Number";
    public static final String BOOLEAN = "Boolean";
    public static final String FILE = "File";
    public static final String OBJECT = "Object";
    public static final String ARRAY = "Array";
    public static final String INTEGER = "Integer";
    public static final String CONTENT_JSON = "application/json";
    public static final String CONTENT_YAML = "text/yaml";
    public static final String TRACKING_DATE_FORMAT = "E MMM dd yyyy HH:mm:ss z Z";
    public static final String TRACKING_TIME_FORMAT = "E MMM dd yyyy HH:mm:ss";
    public static final String NOTIFICATION_DATE_FORMAT = "yyyy-MMM-dd hh:mm:ss";
    public static final String BEGIN_DATE_FORMAT = "dd/MM/yyyy";
    public static final String NOTIFICATION_TEMPLATE_PATH = "notification/emailtemplates";
    public static final String CUSTOM_PLAN_SUBJECT = "Private Plan Creation Request";
    public static final String CUSTOM_PLAN = "CustomPlan";
    public static final String CONTACT_SLLER_SUBJECT = "Message from User for 'ApiName' API";
    public static final String REGISTRATION_REJECTED_SUBJECT = "Your Registration request has been Rejected";
    public static final String REGISTRATION_APPROVED_SUBJECT = "Your Registration request has been Approved";
    public static final String API_NAME = "ApiName";
    public static final String CONTACT_SELLER = "ContactSeller";
    public static final String REGISTRATION_APPROVED = "RegistrationApproved";
    public static final String REGISTRATION_REJECTED = "RegistrationRejected";
    public static final String SUBSCRIPTION_CONFIRMATION = "API Subscription Confirmation";
    public static final String CUSTOM_PLAN_HEADER = "New Plan Request";
    public static final String PAYPER_CALL = "Pay Per Call Plan";
    public static final String PAY_PER_CALL_NAME = "Pay per call";
    public static final String OK = "OK";
    public static final String BEARER = "Bearer ";
    public static final String DEV_APPNAME_REGEX = "[A-Za-z0-9_\\- ]+";
    public static final String MINIMUM_APP_COUNT = "consumer_min_applications";
    public static final String CHARGEABLE_UNIT = "chargeable_unit";
    public static final String SAC_CODE = "productSACCode";
    public static final String BILLING_TYPE = "billing_type";
    public static final String MODEL_MAP = "modelMap";
    public static final int MAX_MODEL_MAP_LENGTH = 5;
    public static final String FEATURE = "feature";
    public static final List<String> FIRWARE_DETAILS_KEYS = new ArrayList<>();
    public static final String FIRMWARE_NAME = "firmwareName";
    public static final String FIRMWARE_REF_NO = "firmwareRefNo";
    public static final String FEATURE_VALUE = "featureValue";
    public static final String STRING_CAPS = "STRING";

    static {
        FILE_UPLOAD_CONFIG_KEYS.add(MAXIMUM_FILE_COUNT);
        FILE_UPLOAD_CONFIG_KEYS.add(MAXIMUM_FILE_SIZE);
        FILE_UPLOAD_CONFIG_KEYS.add(ALLOWED_MIME_TYPES);
        FIRWARE_DETAILS_KEYS.add(FIRMWARE_NAME);
        FIRWARE_DETAILS_KEYS.add(FIRMWARE_REF_NO);
        FIRWARE_DETAILS_KEYS.add(FEATURE_VALUE);
    }

    // throttle policy constants
    public static final String THROTTLE_POLICYNAME_REGEX = "[A-Za-z0-9_\\- ]+";
    public static final String SPECIFIC_IP = "SPECIFIC_IP";
    public static final String IP_RANGE = "IP_RANGE";
    public static final String POLICYID = "policyId";
    public static final String POLICYNAME = "policyName";
    public static final String DEFAULTLIMIT = "defaultLimit";
    public static final String REQCOUNT_KEY = "requestCount";
    public static final String REQCOUNT_VALUE = "2147483647";
    public static final String TYPE_KEY = "type";
    public static final String TYPE_VALUE = "RequestCountLimit";
    public static final String LIMIT = "limit";
    public static final String CONDITIONS = "conditions";
    public static final String COND_GRPS = "conditionalGroups";
    public static final String LIMIT_TIME_MIN = "min";
    public static final String LIMIT_TIME_SEC = "sec";
    public static final String IP_CONDTYPE_KEY = "ipConditionType";
    public static final String API_LEVEL_POLICY = "apiLevelPolicy";
    public static final String THROTTLE_CONDITION_TYPE = "throttle_condition_type";
    public static final String CONFIG_MASTER_TYPE = "config_master_type";
    public static final String UNSUBSCRIBE_REASONS = "unsubscribe_reasons";
    public static final String THROTTLE_CONDPARAM_REGEX = "[A-Za-z0-9_\\-]+";
    public static final String DELETE_USER_REQ = "DeleteUserRequest";
    public static final String DELETE_USER_REQUEST_SUBJECT = "Request for User Account Deletion";
    public static final String DELETED = "DELETED";
    public static final String DOC_LINKS_UPLOADED = "URLs uploaded successfully";
    public static final String DOC_LINKS_DELETED = "URLs deleted successfully";
    public static final String AUDIT_DATE_FORMAT = "MM/dd/yyyy, hh:mm:ss a";
    public static final String TIMEZONE_INDIA = "Asia/Kolkata";

    public static final String SP_SUBSCRIPTION_COUNT = "sp_SubscriptionCount";
    public static final String PRODUCT_ID_SP_PARAM = "product_id";
    public static final String SUBSCRIPTION_STATUS_SP_PARAM = "subscription_status";
    public static final String START_DATE_SP_PARAM = "start_date";
    public static final String END_DATE_SP_PARAM = "end_date";
    public static final String IS_TRYOUT_SP_PARAM = "is_tryout";
    public static final String RESOLUTION_SP_PARAM = "resolution";
    public static final String SUBSCRIPTION_COUNT_MAPPING = "SubscriptionCountDtoMapping";
    public static final String SUBSCRIPTION_DATE_SP_OUT = "subscriptionDate";
    public static final String PRODUCT_NAME_SP_OUT = "productId";
    public static final String SUBSCRIPTION_COUNT_SP_OUT = "subscriptionCount";
    public static final String USERID_SP_PARAM = "created_by";
    public static final String DESCRIPTION = "description";
    public static final String OAUTH2_DESC = "OAuth2 Authentication";
    public static final String OAUTH2 = "OAuth2";
    public static final String NOAUTH_DESC = "No Authentication";
    public static final String BASICAUTH_DESC = "Basic Authentication";
    public static final String AUTHTOKEN_URL = "authTokenUrl";
    public static final String IMPLICIT = "Implicit";
    public static final String PSWD = "Password";
    public static final String CLIENT_CRED = "Client Credentials";
    public static final String REFRESH_TOKEN = "Refresh Token";
    public static final String AUTH_CODE = "Authorization Code";
    public static final String DEVICE_CODE = "Device Code";

    public static final String REGISTRATION_APPROVED_NOTIFICATION = "RegistrationApprovedNotification";
    public static final String REGIST_APPROVED_SUBJECT = "Welcome to Mobility Store!";
    public static final String REGISTRATION_PENDING_NOTIFICATION = "RegistrationPendingNotification";
    public static final String REGIST_PENDING_SUBJECT = "Your application is under review";
    public static final String REGISTRATION_REJECTED_NOTIFICATION = "RegistrationRejectedNotification";
    public static final String REGIST_REJECT_SUBJECT = "Your application is rejected";

    public static final String TBL_API_METHOD = "TBL_API_METHOD";
    public static final String TBL_BILLING_CYCLE = "TBL_BILLING_CYCLE";
    public static final String TBL_FILE_MIME_TYPES = "TBL_FILE_MIME_TYPES";
    public static final String TBL_FILE_UPLOAD_STATUS = "TBL_FILE_UPLOAD_STATUS";
    public static final String TBL_REJECT_REASON_MASTER = "TBL_REJECT_REASON_MASTER";
    public static final String TBL_UNSUBSCRIBE_REASON_MASTER = "UNSUBSCRIBE_REASON_MASTER";
    public static final String TBL_REQ_CONTENT_TYPE = "TBL_REQ_CONTENT_TYPE";
    public static final String TBL_SECURITY_THROTTLE_TYPE = "TBL_SECURITY_THROTTLE_TYPE";
    public static final String TBL_SUBSCRIPTION_STATUS = "TBL_SUBSCRIPTION_STATUS";
    public static final String TBL_TIME_UNIT_TYPE = "TBL_TIME_UNIT_TYPE";
    public static final String TBL_CURRENCY = "TBL_CURRENCY";
    public static final String TBL_LIMIT_TYPE = "TBL_LIMIT_TYPE";
    public static final String TBL_TIME_UNIT = "TBL_TIME_UNIT";
    public static final String TBL_BANDWITDTH_UNIT = "TBL_BANDWITDTH_UNIT";
    public static final String TBL_CHARGEABLE_UNIT = "TBL_CHARGEABLE_UNIT";
    public static final String TBL_BILLING_TYPE = "BILLING_TYPE";
    public static final String PATH_PATTERN = "/[0-9]+/";
    public static final int POOL_SIZE = 10;

    public static final String DELETE_USER = "DeleteUser";
    public static final String DELETE_USER_SUBJECT = "Account Deregistered";
    public static final String API_CONSUMPTION_NOTIFICATION = "APIConsumption";
    public static final String API_CONSUMPTION_SUBJECT = "API Consumption Report";
    public static final String PER_REQUEST_HIT = "PER_REQUEST_HIT";
    public static final String FULL_SLAB = "FULL_SLAB";
    public static final String ONE = "1";
    public static final Integer TEN = 10;
    public static final String ZERO_STRING = "0";
    public static final String USER_REQUEST_INFO_NOTIFICATION = "UserRequestInfoNotification";
    public static final String BUYER_EMAIL_NOTIFICATION = "BuyerEmailNotification";
    public static final String ROLE_ASSIGN = "RoleAssign";
    public static final String QUERY_PARAM_SEGMENTS = "segments";
    public static final String QUERY_PARAM_COUNTRIES = "countries";
    public static final String FEATURE_ACTIVATION_INITIATED = "INITIATED";
    public static final String SELLER = "SELLER";
    public static final String MEDIA_TYPE_FORMDATA = "multipart/form-data";
    public static final String MEDIA_TYPE_FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    public static final String BINARY = "binary";
    public static final String LOS = "L.OS";
    public static final String TAGS = "tags";
    public static final String HIGHLIGHTS = "highlights";
    public static final String REQUEST_SAMPLE = "requestSample";
    public static final String RESPONSE_SAMPLE = "responseSample";
    public static final String REQUEST_BODY = "Request Body";
    public static final String API_PAYLOAD = "API-Payload";
    public static final String NO_MEASUREMENT = "NO_MEASUREMENT";


    //proposal

    public static final String PROPOSAL_ACCEPT_NOTIFICATION = "ProposalAcceptNotification";
    public static final String PROPOSAL_ACCEPT_SUBJECT = "Proposal is Accepted";
    public static final String PROPOSAL_REJECT_NOTIFICATION = "ProposalRejectNotification";
    public static final String PROPOSAL_REJECT_SUBJECT = "Proposal is rejected";
    public static final String PROPOSAL_REJECT_MSG = "Proposal has been Rejected successfully";
    public static final String PROPOSAL_ACCEPT_MSG = "Proposal has been Accepted successfully";
    public static final String PROPOSAL = "Proposal";
    public static final String REQUEST = "Request";

    //Integer Values
    public static final int ZERO = 0;
    public static final int FOUR = 4;
    public static final int THIRTY = 30;
    public static final String SKIP_LOCKED = "-2";
    public static final String PROPOSAL_DOCUMENT_TYPE_ID = "4081cfe0-2084-4536-9ab5-8536c68c3c92";

    public static final String ACCEPT = "Accept";
    public static final String REJECT = "Reject";
    public static final String ACCEPTED = "Accepted";
    public static final String REJECTED = "Rejected";
    public static final String PAYMENT_INFORMATION = "payment-information";
    public static final String BUYER = "BUYER";

    public static final String FAQ = "faq";

    public static final String ORDER_FULLFILLMENT_IN_PROGRESS = "ORDERFULLFILLMENTINPROGRESS";
    public static final String ORDER_DATA_BUYER_SUBSCRIPTION = "DataOrderBuyerSubscription";
    public static final String ORDER_DATA_SELLER_SUBSCRIPTION = "DataOrderSellerSubscription";
    public static final String FIXED_PRICING_BUYER_SUBSCRIPTION = "FixedPricingBuyerSubscription";
    public static final String FIXED_PRICING_SELLER_SUBSCRIPTION = "FixedPricingSellerSubscription";

    public static final String MS_JWT_TOKEN = "ms-jwt-token";
    public static final String ACCESS_TOKEN = "access_token";

    public static final String REST = "REST";

    public static final String PAY_BY_USAGE = "PAY_BY_USAGE";
    public static final String PAY_BY_RECEIPT = "PAY_BY_RECEIPT";
    public static final String READY_TO_POST = "READY_TO_POST";
    public static final String SUCCESS = "SUCCESS";
    public static final String AMOUNT_UNITS = "amount";
    public static final String COMPLETED = "completed";
    public static final String GENERIC_MESSAGE = "Agreed Price";

    public static final String DCS_TOKEN = "dcs-token";
    public static final String IDEMPOTENCY_KEY = "idempotency-key";
    public static final String CONTENTTYPE = "content-type";
    public static final String MCP = "mcp";

    public static final String EVENT_VERSION = "1.0";

    static {
        FILE_UPLOAD_CONFIG_KEYS.add(MAXIMUM_FILE_COUNT);
        FILE_UPLOAD_CONFIG_KEYS.add(MAXIMUM_FILE_SIZE);
        FILE_UPLOAD_CONFIG_KEYS.add(ALLOWED_MIME_TYPES);
    }

    private ApplicationMessageConstants() {
    }

    public enum STATES {
        ORDER_PLACED, ORDER_CONFIRMED, READY_TO_SHIP, INTRANSIT, POD_UPLOADED, BUYER_APPROVED, PAYMENT_PROCESSED, REPLACMENT_INITIATED, REPLACEMENT_CONFIRMED, RETURN_INITIATED, RETURN_CONFIRMED, ORDER_RETURNED, REFUND_INITIATED, BUYER_REJECTED, REJECTED_WITH_POD, REJECTED, ORDER_CANCEL_CONFIRMED, ORDER_CANCEL_INITIATED
    }

    public enum REJECT_REASONS {
        NO_REASON;
    }

    public enum ORDER_STATES {
        ORDER_PLACED, ORDER_CREATED, ORDER_FAILED, COMPLETED
    }

    public enum DATATYPES {
        STRING, NUMBER, BOOLEAN, ENUM, INTEGER, ARRAY, DATE, TIME, OBJECT;
    }

    public enum PUBLISHED_CONDITION {
        PUBLISHED_CONSUMED, PUBLISHED_NOT_CONSUMED;
    }

    public enum ROLES {
        SELLER, BUYER, MSS_P_ADM;
    }

    public enum TimeUnitTypes {
        RATE_LIMIT, BURST_CONTROL;
    }

    public enum BILLING_CYCLE {
        MONTHLY, YEARLY, PAY_PER_CALL, ONE_TIME_PLAN;
    }

    public enum THROTTLE_CONDITIONS {
        IP, PARAM, HEADER, JWT;
    }

    public enum PAYMENT_MODE {
        EMANDATE;
    }

    public enum BILLING_TYPES {
        RECURRING_PAYMENT, ONE_TIME_PURCHASE, FREE_PLAN, TRYOUT_PLAN, CONTACT_SALES;
    }

}