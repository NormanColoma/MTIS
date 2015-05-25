﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.34209
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

// 
// Microsoft.VSDesigner generó automáticamente este código fuente, versión=4.0.30319.34209.
// 
#pragma warning disable 1591

namespace CentrosDeportivos.MembershipService {
    using System;
    using System.Web.Services;
    using System.Diagnostics;
    using System.Web.Services.Protocols;
    using System.Xml.Serialization;
    using System.ComponentModel;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Web.Services.WebServiceBindingAttribute(Name="MembershipServiceSOAP", Namespace="http://www.example.org/MembershipService/")]
    public partial class MembershipService : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        private System.Threading.SendOrPostCallback registerMemberOperationCompleted;
        
        private System.Threading.SendOrPostCallback getMemberOperationCompleted;
        
        private System.Threading.SendOrPostCallback updateMemberOperationCompleted;
        
        private System.Threading.SendOrPostCallback checkMemberOperationCompleted;
        
        private System.Threading.SendOrPostCallback validateMemberOperationCompleted;
        
        private System.Threading.SendOrPostCallback existsMemberOperationCompleted;
        
        private System.Threading.SendOrPostCallback getMemberCodeOperationCompleted;
        
        private bool useDefaultCredentialsSetExplicitly;
        
        /// <remarks/>
        public MembershipService() {
            this.Url = global::CentrosDeportivos.Properties.Settings.Default.CentrosDeportivos_MembershipService_MembershipService;
            if ((this.IsLocalFileSystemWebService(this.Url) == true)) {
                this.UseDefaultCredentials = true;
                this.useDefaultCredentialsSetExplicitly = false;
            }
            else {
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        public new string Url {
            get {
                return base.Url;
            }
            set {
                if ((((this.IsLocalFileSystemWebService(base.Url) == true) 
                            && (this.useDefaultCredentialsSetExplicitly == false)) 
                            && (this.IsLocalFileSystemWebService(value) == false))) {
                    base.UseDefaultCredentials = false;
                }
                base.Url = value;
            }
        }
        
        public new bool UseDefaultCredentials {
            get {
                return base.UseDefaultCredentials;
            }
            set {
                base.UseDefaultCredentials = value;
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        /// <remarks/>
        public event registerMemberCompletedEventHandler registerMemberCompleted;
        
        /// <remarks/>
        public event getMemberCompletedEventHandler getMemberCompleted;
        
        /// <remarks/>
        public event updateMemberCompletedEventHandler updateMemberCompleted;
        
        /// <remarks/>
        public event checkMemberCompletedEventHandler checkMemberCompleted;
        
        /// <remarks/>
        public event validateMemberCompletedEventHandler validateMemberCompleted;
        
        /// <remarks/>
        public event existsMemberCompletedEventHandler existsMemberCompleted;
        
        /// <remarks/>
        public event getMemberCodeCompletedEventHandler getMemberCodeCompleted;
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://www.example.org/MembershipService/registerMember", RequestNamespace="http://www.example.org/MembershipService/", ResponseNamespace="http://www.example.org/MembershipService/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("message", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string registerMember([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] Member member, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] out bool status) {
            object[] results = this.Invoke("registerMember", new object[] {
                        member});
            status = ((bool)(results[1]));
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public void registerMemberAsync(Member member) {
            this.registerMemberAsync(member, null);
        }
        
        /// <remarks/>
        public void registerMemberAsync(Member member, object userState) {
            if ((this.registerMemberOperationCompleted == null)) {
                this.registerMemberOperationCompleted = new System.Threading.SendOrPostCallback(this.OnregisterMemberOperationCompleted);
            }
            this.InvokeAsync("registerMember", new object[] {
                        member}, this.registerMemberOperationCompleted, userState);
        }
        
        private void OnregisterMemberOperationCompleted(object arg) {
            if ((this.registerMemberCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.registerMemberCompleted(this, new registerMemberCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://www.example.org/MembershipService/getMember", RequestNamespace="http://www.example.org/MembershipService/", ResponseNamespace="http://www.example.org/MembershipService/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("member", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public Member getMember([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string code) {
            object[] results = this.Invoke("getMember", new object[] {
                        code});
            return ((Member)(results[0]));
        }
        
        /// <remarks/>
        public void getMemberAsync(string code) {
            this.getMemberAsync(code, null);
        }
        
        /// <remarks/>
        public void getMemberAsync(string code, object userState) {
            if ((this.getMemberOperationCompleted == null)) {
                this.getMemberOperationCompleted = new System.Threading.SendOrPostCallback(this.OngetMemberOperationCompleted);
            }
            this.InvokeAsync("getMember", new object[] {
                        code}, this.getMemberOperationCompleted, userState);
        }
        
        private void OngetMemberOperationCompleted(object arg) {
            if ((this.getMemberCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.getMemberCompleted(this, new getMemberCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://www.example.org/MembershipService/updateMember", RequestNamespace="http://www.example.org/MembershipService/", ResponseNamespace="http://www.example.org/MembershipService/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("status", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public bool updateMember([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] Member member, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] out string message) {
            object[] results = this.Invoke("updateMember", new object[] {
                        member});
            message = ((string)(results[1]));
            return ((bool)(results[0]));
        }
        
        /// <remarks/>
        public void updateMemberAsync(Member member) {
            this.updateMemberAsync(member, null);
        }
        
        /// <remarks/>
        public void updateMemberAsync(Member member, object userState) {
            if ((this.updateMemberOperationCompleted == null)) {
                this.updateMemberOperationCompleted = new System.Threading.SendOrPostCallback(this.OnupdateMemberOperationCompleted);
            }
            this.InvokeAsync("updateMember", new object[] {
                        member}, this.updateMemberOperationCompleted, userState);
        }
        
        private void OnupdateMemberOperationCompleted(object arg) {
            if ((this.updateMemberCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.updateMemberCompleted(this, new updateMemberCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://www.example.org/MembershipService/checkMember", RequestNamespace="http://www.example.org/MembershipService/", ResponseNamespace="http://www.example.org/MembershipService/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("message", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string checkMember([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string memberCode, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] out bool ok) {
            object[] results = this.Invoke("checkMember", new object[] {
                        memberCode});
            ok = ((bool)(results[1]));
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public void checkMemberAsync(string memberCode) {
            this.checkMemberAsync(memberCode, null);
        }
        
        /// <remarks/>
        public void checkMemberAsync(string memberCode, object userState) {
            if ((this.checkMemberOperationCompleted == null)) {
                this.checkMemberOperationCompleted = new System.Threading.SendOrPostCallback(this.OncheckMemberOperationCompleted);
            }
            this.InvokeAsync("checkMember", new object[] {
                        memberCode}, this.checkMemberOperationCompleted, userState);
        }
        
        private void OncheckMemberOperationCompleted(object arg) {
            if ((this.checkMemberCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.checkMemberCompleted(this, new checkMemberCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://www.example.org/MembershipService/validateMember", RequestNamespace="http://www.example.org/MembershipService/", ResponseNamespace="http://www.example.org/MembershipService/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("valid", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public bool validateMember([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string email, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string password) {
            object[] results = this.Invoke("validateMember", new object[] {
                        email,
                        password});
            return ((bool)(results[0]));
        }
        
        /// <remarks/>
        public void validateMemberAsync(string email, string password) {
            this.validateMemberAsync(email, password, null);
        }
        
        /// <remarks/>
        public void validateMemberAsync(string email, string password, object userState) {
            if ((this.validateMemberOperationCompleted == null)) {
                this.validateMemberOperationCompleted = new System.Threading.SendOrPostCallback(this.OnvalidateMemberOperationCompleted);
            }
            this.InvokeAsync("validateMember", new object[] {
                        email,
                        password}, this.validateMemberOperationCompleted, userState);
        }
        
        private void OnvalidateMemberOperationCompleted(object arg) {
            if ((this.validateMemberCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.validateMemberCompleted(this, new validateMemberCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://www.example.org/MembershipService/existsMember", RequestNamespace="http://www.example.org/MembershipService/", ResponseNamespace="http://www.example.org/MembershipService/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("message", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string existsMember([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string email, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] out bool exists) {
            object[] results = this.Invoke("existsMember", new object[] {
                        email});
            exists = ((bool)(results[1]));
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public void existsMemberAsync(string email) {
            this.existsMemberAsync(email, null);
        }
        
        /// <remarks/>
        public void existsMemberAsync(string email, object userState) {
            if ((this.existsMemberOperationCompleted == null)) {
                this.existsMemberOperationCompleted = new System.Threading.SendOrPostCallback(this.OnexistsMemberOperationCompleted);
            }
            this.InvokeAsync("existsMember", new object[] {
                        email}, this.existsMemberOperationCompleted, userState);
        }
        
        private void OnexistsMemberOperationCompleted(object arg) {
            if ((this.existsMemberCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.existsMemberCompleted(this, new existsMemberCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://www.example.org/MembershipService/getMemberCode", RequestNamespace="http://www.example.org/MembershipService/", ResponseNamespace="http://www.example.org/MembershipService/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("memberCoder", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int getMemberCode([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string email) {
            object[] results = this.Invoke("getMemberCode", new object[] {
                        email});
            return ((int)(results[0]));
        }
        
        /// <remarks/>
        public void getMemberCodeAsync(string email) {
            this.getMemberCodeAsync(email, null);
        }
        
        /// <remarks/>
        public void getMemberCodeAsync(string email, object userState) {
            if ((this.getMemberCodeOperationCompleted == null)) {
                this.getMemberCodeOperationCompleted = new System.Threading.SendOrPostCallback(this.OngetMemberCodeOperationCompleted);
            }
            this.InvokeAsync("getMemberCode", new object[] {
                        email}, this.getMemberCodeOperationCompleted, userState);
        }
        
        private void OngetMemberCodeOperationCompleted(object arg) {
            if ((this.getMemberCodeCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.getMemberCodeCompleted(this, new getMemberCodeCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        public new void CancelAsync(object userState) {
            base.CancelAsync(userState);
        }
        
        private bool IsLocalFileSystemWebService(string url) {
            if (((url == null) 
                        || (url == string.Empty))) {
                return false;
            }
            System.Uri wsUri = new System.Uri(url);
            if (((wsUri.Port >= 1024) 
                        && (string.Compare(wsUri.Host, "localHost", System.StringComparison.OrdinalIgnoreCase) == 0))) {
                return true;
            }
            return false;
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.34209")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://www.example.org/MembershipService/")]
    public partial class Member {
        
        private string codeField;
        
        private string emailField;
        
        private string nameField;
        
        private string passwordField;
        
        private string surnameField;
        
        private string nIFField;
        
        private string provinceField;
        
        private string cityField;
        
        private bool vIPField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string code {
            get {
                return this.codeField;
            }
            set {
                this.codeField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string email {
            get {
                return this.emailField;
            }
            set {
                this.emailField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string password {
            get {
                return this.passwordField;
            }
            set {
                this.passwordField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string surname {
            get {
                return this.surnameField;
            }
            set {
                this.surnameField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string NIF {
            get {
                return this.nIFField;
            }
            set {
                this.nIFField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string Province {
            get {
                return this.provinceField;
            }
            set {
                this.provinceField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string City {
            get {
                return this.cityField;
            }
            set {
                this.cityField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public bool VIP {
            get {
                return this.vIPField;
            }
            set {
                this.vIPField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void registerMemberCompletedEventHandler(object sender, registerMemberCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class registerMemberCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal registerMemberCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public string Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((string)(this.results[0]));
            }
        }
        
        /// <remarks/>
        public bool status {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[1]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void getMemberCompletedEventHandler(object sender, getMemberCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class getMemberCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal getMemberCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public Member Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((Member)(this.results[0]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void updateMemberCompletedEventHandler(object sender, updateMemberCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class updateMemberCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal updateMemberCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public bool Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[0]));
            }
        }
        
        /// <remarks/>
        public string message {
            get {
                this.RaiseExceptionIfNecessary();
                return ((string)(this.results[1]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void checkMemberCompletedEventHandler(object sender, checkMemberCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class checkMemberCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal checkMemberCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public string Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((string)(this.results[0]));
            }
        }
        
        /// <remarks/>
        public bool ok {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[1]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void validateMemberCompletedEventHandler(object sender, validateMemberCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class validateMemberCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal validateMemberCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public bool Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[0]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void existsMemberCompletedEventHandler(object sender, existsMemberCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class existsMemberCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal existsMemberCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public string Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((string)(this.results[0]));
            }
        }
        
        /// <remarks/>
        public bool exists {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[1]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void getMemberCodeCompletedEventHandler(object sender, getMemberCodeCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class getMemberCodeCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal getMemberCodeCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public int Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((int)(this.results[0]));
            }
        }
    }
}

#pragma warning restore 1591