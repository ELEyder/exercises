namespace Ejercicios.secuencial
{
    partial class frm02
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
            this.button1 = new System.Windows.Forms.Button();
            this.txtPies = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtCm = new System.Windows.Forms.TextBox();
            this.txtPul = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.txtMt = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.txtYar = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(100, 209);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 20;
            this.button1.Text = "Calcular";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // txtPies
            // 
            this.txtPies.Location = new System.Drawing.Point(145, 141);
            this.txtPies.Name = "txtPies";
            this.txtPies.Size = new System.Drawing.Size(100, 20);
            this.txtPies.TabIndex = 16;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(36, 144);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(30, 13);
            this.label4.TabIndex = 12;
            this.label4.Text = "Pies:";
            // 
            // txtCm
            // 
            this.txtCm.Location = new System.Drawing.Point(145, 64);
            this.txtCm.Name = "txtCm";
            this.txtCm.Size = new System.Drawing.Size(100, 20);
            this.txtCm.TabIndex = 17;
            // 
            // txtPul
            // 
            this.txtPul.Location = new System.Drawing.Point(145, 103);
            this.txtPul.Name = "txtPul";
            this.txtPul.Size = new System.Drawing.Size(100, 20);
            this.txtPul.TabIndex = 18;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(36, 67);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(67, 13);
            this.label2.TabIndex = 13;
            this.label2.Text = "Centímetros:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(36, 106);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(54, 13);
            this.label3.TabIndex = 14;
            this.label3.Text = "Pulgadas:";
            // 
            // txtMt
            // 
            this.txtMt.Location = new System.Drawing.Point(145, 26);
            this.txtMt.Name = "txtMt";
            this.txtMt.Size = new System.Drawing.Size(100, 20);
            this.txtMt.TabIndex = 19;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(36, 29);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(102, 13);
            this.label1.TabIndex = 15;
            this.label1.Text = "Cantidad en Metros:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(36, 186);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(43, 13);
            this.label5.TabIndex = 12;
            this.label5.Text = "Yardas:";
            // 
            // txtYar
            // 
            this.txtYar.Location = new System.Drawing.Point(145, 183);
            this.txtYar.Name = "txtYar";
            this.txtYar.Size = new System.Drawing.Size(100, 20);
            this.txtYar.TabIndex = 16;
            // 
            // frm02
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(296, 244);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.txtYar);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.txtPies);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtCm);
            this.Controls.Add(this.txtPul);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtMt);
            this.Controls.Add(this.label1);
            this.Name = "frm02";
            this.Text = "frm02";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox txtPies;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtCm;
        private System.Windows.Forms.TextBox txtPul;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtMt;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtYar;
    }
}