namespace Fp.condicionales
{
    partial class frm18
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Calcular = new System.Windows.Forms.Button();
            this.txtBolsa = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txtComedor = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtSalud = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtDonacion = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // Calcular
            // 
            this.Calcular.Location = new System.Drawing.Point(258, 38);
            this.Calcular.Name = "Calcular";
            this.Calcular.Size = new System.Drawing.Size(75, 23);
            this.Calcular.TabIndex = 13;
            this.Calcular.Text = "Calcular";
            this.Calcular.UseVisualStyleBackColor = true;
            this.Calcular.Click += new System.EventHandler(this.Calcular_Click);
            // 
            // txtBolsa
            // 
            this.txtBolsa.Location = new System.Drawing.Point(151, 143);
            this.txtBolsa.Name = "txtBolsa";
            this.txtBolsa.Size = new System.Drawing.Size(100, 20);
            this.txtBolsa.TabIndex = 8;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(58, 143);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(39, 13);
            this.label5.TabIndex = 3;
            this.label5.Text = "Bolsa :";
            // 
            // txtComedor
            // 
            this.txtComedor.Location = new System.Drawing.Point(151, 117);
            this.txtComedor.Name = "txtComedor";
            this.txtComedor.Size = new System.Drawing.Size(100, 20);
            this.txtComedor.TabIndex = 9;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(58, 117);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(88, 13);
            this.label4.TabIndex = 4;
            this.label4.Text = "Comedor infantil :";
            // 
            // txtSalud
            // 
            this.txtSalud.Location = new System.Drawing.Point(151, 91);
            this.txtSalud.Name = "txtSalud";
            this.txtSalud.Size = new System.Drawing.Size(100, 20);
            this.txtSalud.TabIndex = 11;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(58, 91);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(87, 13);
            this.label3.TabIndex = 6;
            this.label3.Text = "Centro de salud :";
            // 
            // txtDonacion
            // 
            this.txtDonacion.Location = new System.Drawing.Point(132, 41);
            this.txtDonacion.Name = "txtDonacion";
            this.txtDonacion.Size = new System.Drawing.Size(100, 20);
            this.txtDonacion.TabIndex = 12;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(58, 42);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(59, 13);
            this.label1.TabIndex = 7;
            this.label1.Text = "Donacion :";
            // 
            // frm18
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(374, 229);
            this.Controls.Add(this.Calcular);
            this.Controls.Add(this.txtBolsa);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.txtComedor);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtSalud);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtDonacion);
            this.Controls.Add(this.label1);
            this.Name = "frm18";
            this.Text = "frm18";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Calcular;
        private System.Windows.Forms.TextBox txtBolsa;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtComedor;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtSalud;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtDonacion;
        private System.Windows.Forms.Label label1;
    }
}