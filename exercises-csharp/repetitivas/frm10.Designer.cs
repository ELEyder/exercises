﻿namespace Fp.repetitivas
{
    partial class frm10
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
            this.txaResultado = new System.Windows.Forms.RichTextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txaResultado
            // 
            this.txaResultado.Location = new System.Drawing.Point(52, 90);
            this.txaResultado.Name = "txaResultado";
            this.txaResultado.Size = new System.Drawing.Size(268, 195);
            this.txaResultado.TabIndex = 9;
            this.txaResultado.Text = "";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(145, 61);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 8;
            this.button1.Text = "Calcular ";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // frm10
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(402, 348);
            this.Controls.Add(this.txaResultado);
            this.Controls.Add(this.button1);
            this.Name = "frm10";
            this.Text = "frm10";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.RichTextBox txaResultado;
        private System.Windows.Forms.Button button1;
    }
}