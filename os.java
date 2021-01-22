/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class os
/*     */   extends dd
/*     */ {
/*  12 */   public List a = new ArrayList(); public os(yw par1EntityPlayer) {
/*  13 */     pb[] ablock = { pb.w, pb.t, pb.aw, pb.G, pb.H, pb.I, pb.N, pb.aN, mod_goldytools.heavenlyore, pb.bm, pb.bm, pb.bm, pb.bm, pb.aW, pb.ax, pb.ah, pb.ai, pb.z, pb.O, pb.al, pb.ao, pb.ak, pb.ak, pb.ak, pb.ak, pb.ak, pb.ak, pb.ap, pb.bb, pb.bc, pb.bd, pb.J, pb.J, pb.J, pb.J, (pb)pb.K, (pb)pb.K, (pb)pb.K, (pb)pb.K, pb.v, (pb)pb.u, pb.E, pb.Q, pb.Q, pb.Q, pb.F, pb.W, pb.x, pb.x, pb.x, pb.x, pb.y, pb.y, pb.y, pb.y, (pb)pb.Y, pb.L, pb.aT, pb.aU, (pb)pb.ad, (pb)pb.ae, (pb)pb.af, (pb)pb.ag, pb.aV, pb.br, pb.ba, pb.bf, pb.bu, pb.bp, pb.bq, pb.bA, pb.bB, pb.bC, pb.bJ, (pb)pb.by, pb.bz, (pb)pb.X, (pb)pb.X, pb.au, pb.ay, pb.M, pb.am, pb.an, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.P, pb.aB, pb.R, pb.aY, pb.V, pb.Z, pb.aZ, pb.bv, pb.aF, pb.aG, pb.T, pb.U, pb.aq, pb.at, pb.aH, pb.bw, pb.bx, pb.aJ, pb.aK, pb.aM, pb.aQ, pb.aR, pb.bk, pb.bE, pb.bL };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  29 */     int i = 0;
/*  30 */     int j = 0;
/*  31 */     int k = 0;
/*  32 */     int l = 0;
/*  33 */     int i1 = 0;
/*  34 */     int j1 = 0;
/*  35 */     int k1 = 0;
/*  36 */     int l1 = 0;
/*  37 */     int i2 = 1;
/*     */     
/*  39 */     for (int j2 = 0; j2 < ablock.length; j2++) {
/*     */       
/*  41 */       int i3 = 0;
/*     */       
/*  43 */       if (ablock[j2] == pb.ab) {
/*     */         
/*  45 */         i3 = i++;
/*     */       }
/*  47 */       else if (ablock[j2] == pb.ak) {
/*     */         
/*  49 */         i3 = j++;
/*     */       }
/*  51 */       else if (ablock[j2] == pb.J) {
/*     */         
/*  53 */         i3 = k++;
/*     */       }
/*  55 */       else if (ablock[j2] == pb.x) {
/*     */         
/*  57 */         i3 = l++;
/*     */       }
/*  59 */       else if (ablock[j2] == pb.y) {
/*     */         
/*  61 */         i3 = i1++;
/*     */       }
/*  63 */       else if (ablock[j2] == pb.bm) {
/*     */         
/*  65 */         i3 = j1++;
/*     */       }
/*  67 */       else if (ablock[j2] == pb.Q) {
/*     */         
/*  69 */         i3 = k1++;
/*     */       }
/*  71 */       else if (ablock[j2] == pb.X) {
/*     */         
/*  73 */         i3 = i2++;
/*     */       }
/*  75 */       else if (ablock[j2] == pb.K) {
/*     */         
/*  77 */         i3 = l1++;
/*     */       } 
/*     */       
/*  80 */       this.a.add(new aan(ablock[j2], 1, i3));
/*     */     } 
/*     */     
/*  83 */     for (int k2 = 256; k2 < yr.e.length; k2++) {
/*     */       
/*  85 */       if (yr.e[k2] != null && (yr.e[k2]).bQ != yr.bs.bQ && (yr.e[k2]).bQ != yr.bC.bQ)
/*     */       {
/*  87 */         this.a.add(new aan(yr.e[k2]));
/*     */       }
/*     */     } 
/*     */     
/*  91 */     for (int l2 = 1; l2 < 16; l2++)
/*     */     {
/*  93 */       this.a.add(new aan(yr.aW.bQ, 1, l2));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  98 */     for (Iterator<Integer> iterator = aao.a.keySet().iterator(); iterator.hasNext(); this.a.add(new aan(yr.bC.bQ, 1, integer.intValue())))
/*     */     {
/* 100 */       Integer integer = iterator.next();
/*     */     }
/*     */     
/* 103 */     aak inventoryplayer = par1EntityPlayer.ap;
/*     */     
/* 105 */     for (int j3 = 0; j3 < 9; j3++) {
/*     */       
/* 107 */       for (int l3 = 0; l3 < 8; l3++)
/*     */       {
/* 109 */         a(new yu((io)sr.g(), l3 + j3 * 8, 8 + l3 * 18, 18 + j3 * 18));
/*     */       }
/*     */     } 
/*     */     
/* 113 */     for (int k3 = 0; k3 < 9; k3++)
/*     */     {
/* 115 */       a(new yu((io)inventoryplayer, k3, 8 + k3 * 18, 184));
/*     */     }
/*     */     
/* 118 */     a(0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(yw par1EntityPlayer) {
/* 123 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float par1) {
/* 131 */     int i = this.a.size() / 8 - 8 + 1;
/* 132 */     int j = (int)((par1 * i) + 0.5D);
/*     */     
/* 134 */     if (j < 0)
/*     */     {
/* 136 */       j = 0;
/*     */     }
/*     */     
/* 139 */     for (int k = 0; k < 9; k++) {
/*     */       
/* 141 */       for (int l = 0; l < 8; l++) {
/*     */         
/* 143 */         int i1 = l + (k + j) * 8;
/*     */         
/* 145 */         if (i1 >= 0 && i1 < this.a.size()) {
/*     */           
/* 147 */           sr.g().a(l + k * 8, this.a.get(i1));
/*     */         }
/*     */         else {
/*     */           
/* 151 */           sr.g().a(l + k * 8, null);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(int i, int j, boolean flag, yw entityplayer) {}
/*     */ }


/* Location:              C:\Users\Reagan\Desktop\godlytooslmod\GodlyToolsMod\!\os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */