package weddings.webapp;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.apache.wicket.protocol.http.WicketFilter;

@WebFilter(value = "/web/*", initParams = {
        @WebInitParam(name = "applicationClassName", value = "at.grueneis.timetable.webapp.TimetableManagementApplication"),
        @WebInitParam(name = "filterMappingUrlPattern", value = "/web/*")})
public class WeddingManagementFilter extends WicketFilter {
}
