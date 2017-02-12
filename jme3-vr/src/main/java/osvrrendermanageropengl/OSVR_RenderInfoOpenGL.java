package osvrrendermanageropengl;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
import osvrmatrixconventions.OSVR_Pose3;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public /*abstract*/ class OSVR_RenderInfoOpenGL extends Structure {
	/** C type : OSVR_GraphicsLibraryOpenGL */
	public OSVR_GraphicsLibraryOpenGL library;
	/** C type : OSVR_ViewportDescription */
	public OSVR_ViewportDescription viewport;
        public OSVR_Pose3 pose;
	/** C type : OSVR_ProjectionMatrix */
	public OSVR_ProjectionMatrix projection;
	public OSVR_RenderInfoOpenGL() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("library", "viewport", "pose", "projection");
	}
	/**
	 * @param library C type : OSVR_GraphicsLibraryOpenGL<br>
	 * @param viewport C type : OSVR_ViewportDescription<br>
	 * @param projection C type : OSVR_ProjectionMatrix
	 */
	public OSVR_RenderInfoOpenGL(OSVR_GraphicsLibraryOpenGL library, OSVR_ViewportDescription viewport, OSVR_Pose3 pose, OSVR_ProjectionMatrix projection) {
		super();
		this.library = library;
		this.viewport = viewport;
                this.pose = pose;
		this.projection = projection;
	}
	public OSVR_RenderInfoOpenGL(Pointer peer) {
		super(peer);
	}
	public static /*abstract*/ class ByReference extends OSVR_RenderInfoOpenGL implements Structure.ByReference {
		
	};
	public static /*abstract*/ class ByValue extends OSVR_RenderInfoOpenGL implements Structure.ByValue {
		
	};
}