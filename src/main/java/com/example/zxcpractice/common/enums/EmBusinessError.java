package com.example.zxcpractice.common.enums;

import com.example.zxcpractice.common.error.CommonError;

public enum EmBusinessError implements CommonError {

  // errCode 错误码, errMsg 错误描述
  PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
  SENDTOUSER_VALIDATION_ERROR(10002, "抄送人不能包含创建人"),
  HANDLER_VALIDATION_ERROR(10003, "处理人不能为创建人"),
  HANDLER_VALIDATION_NOTNULL_ERROR(10010, "处理人不能为空"),
  FARWARD_VALIDATION_ERROR(10004, "转发人不能为当前操作人"),
  FARWARD_COPY_VALIDATION_ERROR(10005, "抄送人不能包含当前操作人"),
  FARWARD_COPY_HANDEL_VALIDATION_ERROR(10006, "抄送人不能包含处理人"),
  COPY_HANDEL_VALIDATION_ERROR(10007, "抄送人信息为空"),
  BusinesLine_VALIDATION_ERROR(10008, "业务线信息为空"),
  DATE_VALIDATION_ERROR(10009, "日期格式非法：yyyyMMdd"),
  NO_UNSOLVE_WORKORDER_ERROR(10010, "无未处理BUG类型工单"),
  NO_PHONE_LINE_ERROR(10011, "电话线路不能为空"),

  ILLEGAL_OPERATION(400, "非法请求"),
  Authorize_ERROR(40001, "获取用户身份异常"),
  PERMISSION_ERROR(40002, "该用户无此工单操作权限"),
  UNKNOW_ERROR(40003, "通讯异常，请稍后再试"),

  FAILURE(500, "服务升级中请稍后再试"),
  FAIL(503999, "失败"),
  PERMISSION_DENIED(503001, "Token验证失败"),
  USER_NOT_PERMISSION(503001, "此用户没有权限进入"),
  CODE_IS_FAILURE(503002, "code码已失效"),
  WX_USER_NOT_PERMISSION(503003, "此微信用户没有权限进入"),
  WX_USER_LOGIN_FAILURE(503004, "登陆已失效，请重新登陆"),
  HTTP_METHOD_ERROR(503005, "Http请求方法错误"),
  OPEN_IN_LARK(503006, "请在飞书内打开应用"),
  DUPLICATE_SUBMISSION(503007, "操作过于频繁"),
  DRUG_NAME_IS_NULL(503008, "请输入要查询的代表姓名"),
  CALL_SAVE_FAIL(503009, "问卷调查保存失败"),
  HOSPTIAL_LIST_NULL(503010, "请输入目标医院"),
  CONNECTED_SAVE_FAIL(503011, "拜访记录保存失败"),
  FLOW_ERROR(503012, "流程错误"),
  INPUT_KEY_ERROR(503013, "输入的关键字不合法"),
  INVALID_INPUT_ERROR(503014, "请勿输入特殊字符"),
  SYSTEM_ERROR(503015, "线下代表模块服务升级中请稍后再试"),
  VISIT_RESULT_ISNULL(503016, "请选择拜访结果"),
  FILE_MAX(503017, "文件大小不能超过2M"),
  FILE_SUFFIX_ERROR(503018, "图片格式错误，仅支持png、jpg格式"),
  REMARK_LENGTH_ERROR(503019, "备注不能超过300字"),
  DEPARTMENTIS_NULL(503020, "此科室会记录已经不存在"),
  EXCEL_IMPORT_DATA_NULL(503021, "文件数据为空"),
  EXCEL_FIELD_ORDER(503022, "excel表头字段名错误"),
  EXCEL_DATA_MAX(503023, "最大允许导入5000条数据"),
  INPUT_TEXT_ERROR(503024, "不允许输入emoji表情"),
  LARK_ACCESS_TOEKN_ERROR(503025, "获取飞书AccessToken失败"),
  LARK_EMAIL_NOT_FOUND_ERROR(503026, "根据用户邮箱未查询到用户"),
  PARAM_DOCTOR_ID_ERROR(503027, "医生id为空"),
  PARAM_DOCTOR_ID_NULL(503028, "当前医生没有查询数据"),
  DOCTOR_NOT_EXITES(503029, "医生不存在"),
  NDC_HOSPITAL_NOT_FOUND(503030, "该医院未关联产品，请与管理员联系"),
  DOCTOR_EXITES(503031, "医生已存在"),
  JSON_FOLLOW_CLUES(503032, "线索json格式错误"),
  BENGIN_TIME_IS_NULL(503033, "请输入开始日期"),
  END_TIME_IS_NULL(503034, "请输入结束日期"),
  BEGIN_END_TIME_IS_ERROR(503035, "开始日期不能大于结束日期"),
  BEGIN_END_TIME_IS_BIG(503036, "时间范围不能超过6个月"),
  REPORT_TYPES(503037, "请选择报表类型"),
  EXPORT_EXCEL_ERROR(503038, "excel 生成错误，请稍后再试"),
  UPLOAD_FAIL(503039, "文件上传OSS失败，请稍后再试"),
  UPLOAD_RECORD_SAVE_FAIL(503040, "文件记录保存失败，请稍后再试"),
  JOB_GET_FAIL(503041, "任务获取失败"),
  JOB_NOT_EXISTS(503042, "任务不存在"),
  JOB_ALREADY_SEND(503043, "任务已下发"),
  JOB_IMPORTING(503044, "此任务已有导入任务，请稍后再导入"),
  EXPORT_STATISTICS_IMPORTING(503045, "您有一项导出正在进行中，请稍后再试"),
  DRUG_IS_NULL(503046, "药品不存在"),
  DRUG_IS_DELETE(503047, "药品已删除"),
  HAVE_NOT_DRUG_USER(503048, "无线上代表跟进，已反馈管理员跟进"),
  PARAM_DOCTOR_CODE_ERROR(503049, "医生CODE为空"),
  AUDIT_IMAGE_ERROR(503050, "审核上传图片为空"),
  AUDIT_REMARK_ERROR(503051, "修改医生备注为空"),
  WECHAT_DECRYPT_ERROR(503052, "请重新点击微信授权登陆"),
  WECHAT_LOGIN_INVALID(503053, "登陆已失效，请重新登陆"),
  EXPORT_COUNT_ZERO(503054, "无数据"),
  IMPORT_EXCEL_COUNT_ZERO(503055, "文件数据不可为空"),
  HOSPITAL_MEDICINE_IMPORTING(503056, "您有一项导入正在进行中，请稍后再试"),
  HOSPITAL_IDS_IS_NULL(503057, "请输入要关联的医院"),
  MEDICINEIDS_IDS_IS_NULL(503058, "请输入要关联的药品"),
  DRUG_USER_NOT_EXITS(503059, "代表不存在"),
  UPLOAD_FILE_SIZE(503060, "上传文件大于10M"),
  AUDIT_ORDER_NOT_ALLOW_UPDATE(503061, "审核记录已关闭不允许修改"),
  AUDIT_NUM_MAX_NUMBER(503062, "最多审核次数2"),
  AUDIT_RECORD_IS_NOT_AUDIT(503063, "审核记录不是待审核状态"),
  AUDIT_RECORD_ID_IS_NOT_AUDIT(503064, "审核记录ID不能为空"),
  AUDIT_RECORD_ID_IS_ERROR(503065, "无审核记录"),
  AUDIT_ORDER_GOING_NOT_ALLOW_UPDATE(503066, "审核中不允许修改"),
  AUDIT_FAIL(503067, "审核失败，请重新点击审批"),
  NEED_TO_AUDIT(503068, "需要审核，请在操作记录中查看状态"),
  VISIT_TIME_TYPE(503069, "请选择拜访时段"),
  VISIT_TIME_TYPE_IMAGE(503070, "选择早访或夜访"),
  PRODUCT_NAME_ERROR(503071, "产品名错误，请检查是否存在该产品"),
  PARAM_NOT_EMPTY(503072, "请检查必填项"),
  ENTERPRISE_NO_TYPE_ERROR(503073, "同一企业不可选择多种类型"),
  MEDICINE_NOT_EMPTY(503074, "药品id不能为空"),
  HOSPITAL_NOT_EMPTY(503075, "医院id不能为空"),
  DOCTOR_TITLE_NOT_EMPTY(503076, "医生职称不能为空"),
  DOCTOR_POSITION_NOT_EMPTY(503077, "医生职务不能为空"),
  COMMENT_REMARK_SIZE(503078, "备注需要满足15到300字"),
  DOCTOR_WECHAT_BIND_STATUS(503079, "医生绑定状态不能为空"),
  MEETING_STATUS_NOT_EMPTY(503080, "科室会绑定状态不能为空"),
  LANDING_OR_ENTER_STATUS_NOT_EMPTY(503081, "提单进院状态不能为空"),
  WORK_ORDER_OPERATE_TYPE(503082, "无效的工单提交类型"),
  WORK_ORDER_STOP_REASON(503083, "请选择终止理由"),
  WORK_ORDER_COMMENT_TYPE(503084, "请选择工单评论类型"),
  ORDER_TYPE_ID_NOT_EMPTY(503085, "工单id不能为空"),
  DOCTOR_RECRUIT_PARAM_ERROR(503086, "医生招募时参数错误"),
  DOCTOR_RECRUIT_RESULT_ID_NOT_EMPTY(503087, "拜访结果不能为空"),
  DOCTOR_RECRUIT_DRUG_IS_EMPTY(503088, "拜访时药品为空"),
  VISIT_RESULT_DRUG_CAN_NOT_REPEAT(503089, "拜访时药品不可以重复"),
  BIND_FAILD(503082, "绑定失败，请稍后再试"),
  PERMISSION_DENIED_FOR_EXPORT_FOLLOW_UP_VISIT(503090, "当前用户没有导出随访的权限"),
  PERMISSION_DENIED_FOR_FOLLOW_UP_VISIT(503091, "当前用户没有随访权限"),
  PERMISSION_DENIED_FOR_CURRENT_USER(503092, "当前用户没有操作权限"),
  PLEASE_SWITCH_OTHER_DRUG_USER(503093, "要切换的角色登陆信息不存在，请切换其他线下代表"),
  DOCTOR_WECHAT_BIND_DOCTORCODE_REPEAT(503094, "换绑医生与原医生一致，请选择其他医生换绑"),
  FAILED_TO_CALL_LARK(503095, "飞书发送消息失败，请稍后再试！"),
  DRUG_AFFAIRS_INFO_NOT_EMPTY(503096, "药事会相关信息不能为空"),
  OTHER_REMARK_NOT_EMPTY(503097, "备注信息不能为空"),
  DECISION_MAKER_CODE_ERROR(503098, "进院核心决策人枚举值信息有误"),
  OPERATE_CODE_ERROR(503099, "操作记录为空"),
  WORKORDERSTATUS_CODE_ERROR(503101, "工单状态异常"),
  CURRENT_TIME_CODE_ERROR(5030102, "获取上一次操作时间失败");

  private int errCode;
  private String errMsg;


  EmBusinessError(int errCode, String errMsg) {
    this.errCode = errCode;
    this.errMsg = errMsg;
  }

  @Override
  public int getErrCode() {
    return this.errCode;
  }

  @Override
  public String getErrMsg() {
    return this.errMsg;
  }


  /**
   * 设置通用错误的errMsg
   *
   * @param errMsg
   * @return
   */
  @Override
  public CommonError setErrMsg(String errMsg) {
    this.errMsg = errMsg;
    return this;
  }


}