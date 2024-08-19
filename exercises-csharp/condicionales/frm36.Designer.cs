namespace Fp.condicionales
{
    partial class frm36
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
            this.label2 = new System.Windows.Forms.Label();
            this.txtCuaderno = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.txaObsequio = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // Calcular
            // 
            this.Calcular.Location = new System.Drawing.Point(246, 51);
            this.Calcular.Name = "Calcular";
            this.Calcular.Size = new System.Drawing.Size(75, 23);
            this.Calcular.TabIndex = 17;
            this.Calcular.Text = "Calcular";
            this.Calcular.UseVisualStyleBackColor = true;
            this.Calcular.Click += new System.EventHandler(this.Calcular_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(46, 81);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(58, 13);
            this.label2.TabIndex = 13;
            this.label2.Text = "Obsequio :";
            // 
            // txtCuaderno
            // 
            this.txtCuaderno.Location = new System.Drawing.Point(120, 54);
            this.txtCuaderno.Name = "txtCuaderno";
            this.txtCuaderno.Size = new System.Drawing.Size(100, 20);
            this.txtCuaderno.TabIndex = 16;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(46, 55);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(64, 13);
            this.label1.TabIndex = 14;
            this.label1.Text = "Cuadernos :";
            // 
            // txaObsequio
            // 
            this.txaObsequio.Location = new System.Drawing.Point(120, 80);
            this.txaObsequio.Multiline = true;
            this.txaObsequio.Name = "txaObsequio";
            this.txaObsequio.Size = new System.Drawing.Size(100, 61);
            this.txaObsequio.TabIndex = 15;
            // 
            // frm36
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(368, 175);
            this.Controls.Add(this.Calcular);
            this.Controls.Add(this.txaObsequio);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txtCuaderno);
            this.Controls.Add(this.label1);
            this.Name = "frm36";
            this.Text = "frm36";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Calcular;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtCuaderno;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txaObsequio;
    }
}