using System.ComponentModel.DataAnnotations;

namespace CentrosDeportivos.Models
{
    public class LoginViewModel
    {
        [Required]
        [EmailAddress]
        [Display(Name = "Correo electrónico")]
        public string Email { get; set; }

        [Required]
        [DataType(DataType.Password)]
        [Display(Name = "Contraseña")]
        public string Password { get; set; }

        [Display(Name = "¿Recordar cuenta?")]
        public bool RememberMe { get; set; }
    }
    public class RegisterViewModel
    {
        [Required]
        [EmailAddress]
        [Display(Name = "Correo electrónico")]
        public string Email { get; set; }

        [Required]
        [StringLength(100, ErrorMessage = "El número de caracteres de {0} debe ser al menos {2}.", MinimumLength = 6)]
        [DataType(DataType.Password)]
        [Display(Name = "Contraseña")]
        public string Password { get; set; }

        [RegularExpression(@"^[A-Z]+[a-zA-ZÁÉÍÓÚáéíóuñÑ''-'\s_ ]*$", ErrorMessage = "Introduce un nombre válido")]
        [Required]
        [StringLength(30)]
        [Display(Name = "Nombre")]
        public string Name { get; set; }

        [RegularExpression("^(([A-Z]\\d{8})|(\\d{8}[A-Z]))$", ErrorMessage = "DNI incorrecto")]
        [Display(Name = "Ingrese su DNI")]
        public string DNI { get; set; }
    }

    public class ResetPasswordViewModel
    {
        [Required]
        [EmailAddress]
        [Display(Name = "Correo electrónico")]
        public string Email { get; set; }

        [Required]
        [StringLength(100, ErrorMessage = "El número de caracteres de {0} debe ser al menos {2}.", MinimumLength = 6)]
        [DataType(DataType.Password)]
        [Display(Name = "Contraseña")]
        public string Password { get; set; }

        [DataType(DataType.Password)]
        [Display(Name = "Confirmar contraseña")]
        [Compare("Password", ErrorMessage = "La contraseña y la contraseña de confirmación no coinciden.")]
        public string ConfirmPassword { get; set; }

        public string Code { get; set; }
    }

    public class ForgotPasswordViewModel
    {
        [Required]
        [EmailAddress]
        [Display(Name = "Correo electrónico")]
        public string Email { get; set; }

        [RegularExpression("^(([A-Z]\\d{8})|(\\d{8}[A-Z]))$", ErrorMessage = "DNI incorrecto")]
        [Display(Name = "Ingrese su DNI")]
        public string DNI { get; set; }
    }
}
